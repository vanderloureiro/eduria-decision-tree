package com.br.eduriadecisiontree.domain;

import java.util.function.Predicate;

public class ScoreNode extends Node {

    private Predicate<Double> predicate;

    public ScoreNode(Predicate<Double> predicate) {
        this.predicate = predicate;
    }

    @Override
    public Node verify(ReportCard reportCard) throws Exception {
        if (this.predicate.test(reportCard.getScore())) {
            return this.leftNode;
        }
        return this.rightNode;
    }
    
}