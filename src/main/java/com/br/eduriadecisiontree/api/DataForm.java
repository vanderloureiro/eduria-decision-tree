package com.br.eduriadecisiontree.api;

import lombok.Data;

@Data
public class DataForm {
    
    private Long registerId;
    private Integer studentAge;
    private String courseName;
    private Long easyQuestionsAnswered;
    private Long mediumQuestionsAnswered;
    private Long hardQuestionsAnswered;
    private Long qttAllQuestionsAnswered;
    private Long qttAllCourseQuestions;
    private String lastQuestionLevel;
    private boolean lastQuestionAnsweredCorrect;
}