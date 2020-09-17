package com.br.eduriadecisiontree.api;

import com.br.eduriadecisiontree.domain.LevelEnum;

import lombok.Data;

@Data
public class DataForm {
    
    private Long registerId;
    private Long studentId;
    private Integer studentAge;
    private String courseName;
    private Integer easyQuestionsAnsweredCorrect;
    private Integer mediumQuestionsAnsweredCorrect;
    private Integer hardQuestionsAnsweredCorrect;
    private Integer qttAllQuestionsAnswered;
    private Integer qttAllCourseQuestions;
    private LevelEnum lastQuestionLevel;
    private boolean lastQuestionWasAnsweredCorrect;
}