package com.br.eduriadecisiontree.domain;

public class DecisionTree {

    private Node root;

    public void createTree() {
        Node n1 = new ScoreNode(p -> p < 4);
        Node n2 = new ScoreNode(p -> p < 7);
        Node n3 = new FinalNode(ChosenLevelEnum.EASY);
        Node n4 = new FinalNode(ChosenLevelEnum.MEDIUM);
        Node n5 = new FinalNode(ChosenLevelEnum.HARD);

        // setting first level
        n1.setLeftNode(n3);
        n1.setRightNode(n2);

        // setting secong level
        n2.setLeftNode(n4);
        n2.setRightNode(n5);

        this.root = n1;
    }

    public ChosenLevelEnum search(ReportCard reportCard) {
        return this.searchOnNodes(reportCard).getChosenLevelEnum();
    }

    private Node searchOnNodes(ReportCard reportCard) {
        try {
            this.root = root.verify(reportCard);
            return this.searchOnNodes(reportCard);
        } catch(Exception e) {
            return root;
        }
    }
}