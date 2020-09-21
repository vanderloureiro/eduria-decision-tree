package com.br.eduriadecisiontree.domain;

import java.util.Arrays;
import java.util.Random;

import com.br.eduriadecisiontree.api.DataDTO;
import com.br.eduriadecisiontree.api.DataForm;
import com.br.eduriadecisiontree.api.LevelQuestionEnum;

import org.springframework.stereotype.Service;

@Service
public class DecisionTreeService {

    public DecisionTreeService() { }

    public DataDTO search(DataForm form) {
        ReportCard card = new ReportCard();

        card.setQttQuestionsAnswered(form.getQttAllQuestionsAnswered());
        card.setScore(form.getScore());

        DataDTO dtoReturn = new DataDTO();
        dtoReturn.setRegisterUuid(form.getRegisterUuid());
        dtoReturn.setSelectedLevel(this.getLevel(card));

        return dtoReturn;
    }

    public LevelQuestionEnum getLevel(ReportCard card) {
        DecisionTree tree = new DecisionTree();
        LevelEnum found   = tree.search(card);
        if (found == LevelEnum.EASY) {
            return LevelQuestionEnum.EASY;
        }
        if (found == LevelEnum.MEDIUM) {
            return LevelQuestionEnum.MEDIUM;
        }
        if (found == LevelEnum.HARD) {
            return LevelQuestionEnum.HARD;
        }

        int index = new Random().nextInt(3);
        return Arrays.asList(LevelQuestionEnum.values()).get(index);
    }
    
}