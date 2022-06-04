package com.damian.bodzioch;

public class Tree {
    private Node root;

    public void add(int value){
        if (this.root == null){
            this.root = new Node(value);
        } else {
            Node newNode = findPlace(value, root);
            newNode = new Node(value);
        }

    }

    public boolean contains(int value){
        return contains(value, this.root);
    }

    private boolean contains(int value, Node node){
        if (this.root != null) {
            if (value == node.getValue()) {
                return true;
            } else if (value > node.getValue() && node.getBigger() != null){
                contains(value, node.getBigger());
            } else if (value < node.getValue() && node.getSmaller() != null){
                contains(value, node.getSmaller());
            }
        }
        return false;
    }

    public int max(){
        return max(this.root);
    }

    private int max(Node node){
        max
    }

    public int min(){

    }

    private Node findPlace (int value, Node root){
        if (value > root.getValue()){
            if (root.getBigger() == null){
                return root;
            } else {
                findPlace(value, root.getBigger());
            }
        } else if (value < root.getValue()){
            if (root.getSmaller() == null){
                return root;
            } else {
                findPlace(value, root.getSmaller());
            }
        }
        return root;
    }
}
