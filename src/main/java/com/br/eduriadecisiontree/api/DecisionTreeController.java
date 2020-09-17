package com.br.eduriadecisiontree.api;

import com.br.eduriadecisiontree.domain.DecisionTreeService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "*")
@Api("DecisionTree API")
@RequestMapping("/decision-tree")
@RestController
public class DecisionTreeController {

    private DecisionTreeService service;

    public DecisionTreeController(DecisionTreeService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<DataDTO> search(@RequestBody DataForm form) {

        return ResponseEntity.ok().body(this.service.search(form));
    }

}