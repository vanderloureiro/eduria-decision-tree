package com.br.eduriadecisiontree.domain;

public class FinalNode extends Node {

    public FinalNode(ChosenLevelEnum chosenLevelEnum) {
        this.chosenLevelEnum = chosenLevelEnum;
    }

    @Override
    public Node verify(ReportCard reportCard) throws Exception {
        throw new Exception(this.chosenLevelEnum.name());
    }
    
}