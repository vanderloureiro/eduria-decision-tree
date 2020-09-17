package com.br.eduriadecisiontree.domain;

import com.br.eduriadecisiontree.api.DataDTO;
import com.br.eduriadecisiontree.api.DataForm;

import org.springframework.stereotype.Service;

@Service
public class DecisionTreeService {

    public DecisionTreeService() { }

    public DataDTO search(DataForm form) {
        DecisionTree tree = new DecisionTree();
        ReportCard card   = new ReportCard();

        card.setQttQuestionsAnswered(form.getQttAllQuestionsAnswered());
        card.setScore(this.calculateScore(form));

        DataDTO dtoReturn = new DataDTO();
        dtoReturn.setRegisterId(form.getRegisterId());
        dtoReturn.setSelectedLevel(tree.search(card));

        return dtoReturn;
    }

    private Double calculateScore(DataForm form) {

        Integer qqAllAnswedQuestions = form.getEasyQuestionsAnsweredCorrect() +
        form.getMediumQuestionsAnsweredCorrect() + form.getHardQuestionsAnsweredCorrect();

        Integer resultScore = (qqAllAnswedQuestions * 10) / form.getQttAllCourseQuestions();

        return resultScore.doubleValue();
    }
    
}