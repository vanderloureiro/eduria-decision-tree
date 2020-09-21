package com.br.eduriadecisiontree.domain;

import java.util.function.Predicate;

public class ScoreNode extends Node {

    private Predicate<Integer> predicate;

    public ScoreNode(Predicate<Integer> predicate) {
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