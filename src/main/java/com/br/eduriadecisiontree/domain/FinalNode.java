package com.br.eduriadecisiontree.domain;

public class FinalNode extends Node {

    public FinalNode(LevelEnum levelEnum) {
        this.levelEnum = levelEnum;
    }

    @Override
    public Node verify(ReportCard reportCard) throws Exception {
        throw new Exception(this.levelEnum.name());
    }
    
}