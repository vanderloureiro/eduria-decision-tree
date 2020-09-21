package com.br.eduriadecisiontree.api;

import java.util.UUID;

import lombok.Data;

@Data
public class DataForm {
    
    private UUID registerUuid;
    private Long studentId;
    private Integer studentAge;
    private String courseName;
    private Integer easyQuestionsAnsweredCorrect;
    private Integer mediumQuestionsAnsweredCorrect;
    private Integer hardQuestionsAnsweredCorrect;
    private Integer qttAllQuestionsAnswered;
    private Integer qttAllCourseQuestions;
    private Integer score;
    private LevelQuestionEnum lastQuestionLevel;
    private Boolean lastQuestionWasAnsweredCorrect;
}