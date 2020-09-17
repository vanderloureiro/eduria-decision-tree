package com.br.eduriadecisiontree.domain;

public class DecisionTree {
    
    private Node root;

    public DecisionTree() {
        this.createTree();
    }

    public void createTree() {
        Node n1 = new ScoreNode(p -> p < 4);
        Node n2 = new ScoreNode(p -> p < 7);
        Node n3 = new QttAnsweredNode(p -> p < 20);
        Node n4 = new QttAnsweredNode(p -> p % 2 != 0); //odd
        Node n5 = new FinalNode(LevelEnum.EASY);
        Node n6 = new FinalNode(LevelEnum.MEDIUM);
        Node n7 = new FinalNode(LevelEnum.HARD);
        Node n8 = new FinalNode(LevelEnum.RANDOM);

        n1.leftNode  = n3;
        n1.rightNode = n2;

        n2.leftNode  = n6;
        n2.rightNode = n7;

        n3.leftNode  = n4;
        n3.rightNode = n5;

        n4.leftNode  = n8;
        n4.rightNode = n5;

        this.root = n1;
    }

    public LevelEnum search(ReportCard reportCard) {
        return this.searchOnNodes(reportCard).getLevelEnum();
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