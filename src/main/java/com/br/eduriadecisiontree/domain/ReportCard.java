package com.br.eduriadecisiontree.domain;

public class ReportCard {

    private Integer score;
    private Integer qttQuestionsAnswered;

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getScore() {
        return this.score;
    }
    
    public void setQttQuestionsAnswered(Integer qtt) {
        this.qttQuestionsAnswered = qtt;
    }

    public Integer getQttQuestionsAnswered() {
        return this.qttQuestionsAnswered;
    }
}