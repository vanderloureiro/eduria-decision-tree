package com.br.eduriadecisiontree.api;

import com.br.eduriadecisiontree.domain.LevelEnum;

import lombok.Data;

@Data
public class DataDTO {

    private Long registerId;
    private LevelEnum selectedLevel;
    
}