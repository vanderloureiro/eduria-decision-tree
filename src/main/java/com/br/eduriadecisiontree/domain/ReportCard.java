package com.br.eduriadecisiontree.domain;

public class ReportCard {

    private Double score;
    private Integer qttQuestionsAnswered;

    public void setScore(Double score) {
        this.score = score;
    }

    public Double getScore() {
        return this.score;
    }
    
    public void setQttQuestionsAnswered(Integer qtt) {
        this.qttQuestionsAnswered = qtt;
    }

    public Integer getQttQuestionsAnswered() {
        return this.qttQuestionsAnswered;
    }
}