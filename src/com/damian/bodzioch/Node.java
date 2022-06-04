package com.damian.bodzioch;

public class Node {
    private int value;
    private Node bigger;
    private Node smaller;

    
    public Node() {
    }

    public Node(int value){
        this.value = value;
        this.bigger = new Node();
        this.smaller = new Node();
    }

    public int getValue() {
        return value;
    }

    public Node getBigger() {
        return bigger;
    }

    public Node getSmaller() {
        return smaller;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setBigger(Node bigger) {
        this.bigger = bigger;
    }

    public void setSmaller(Node smaller) {
        this.smaller = smaller;
    }


}
