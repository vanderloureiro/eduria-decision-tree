package com.br.eduriadecisiontree.domain;

import java.util.function.Predicate;


public class QttAnsweredNode extends Node {

    private Predicate<Integer> predicate;

    public QttAnsweredNode(Predicate<Integer> predicate) {
        this.predicate = predicate;
    }

    @Override
    public Node verify(ReportCard reportCard) throws Exception {
        if (this.predicate.test(reportCard.getQttQuestionsAnswered())) {
            return this.leftNode;
        }
        return this.rightNode;
    }

    
}