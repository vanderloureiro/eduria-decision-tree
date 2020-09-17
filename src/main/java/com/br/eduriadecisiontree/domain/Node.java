package com.br.eduriadecisiontree.domain;

public abstract class Node {

    protected Node leftNode;
    protected Node rightNode;
    protected LevelEnum levelEnum;
    
    public Node verify(ReportCard reportCard) throws Exception { 
        return null;
    };

    public Node getLeftNode() {
        return this.leftNode;
    }

    public Node setLeftNode(Node node) {
        return this.leftNode = node;
    }

    public Node getRightNode() {
        return this.rightNode;
    }

    public Node setRightNode(Node node) {
        return this.rightNode = node;
    }

    public LevelEnum getLevelEnum() {
        return this.levelEnum;
    }

    public LevelEnum setLevelEnum(LevelEnum level) {
        return this.levelEnum = level;
    }


}