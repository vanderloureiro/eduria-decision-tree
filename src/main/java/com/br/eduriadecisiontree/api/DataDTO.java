package com.br.eduriadecisiontree.api;

import java.util.UUID;

import lombok.Data;

@Data
public class DataDTO {

    private UUID registerUuid;
    private LevelQuestionEnum selectedLevel;
    
}