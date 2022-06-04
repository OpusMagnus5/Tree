package com.damian.bodzioch;

public class Tree {
    private Node root;

    public void add(int value){
        if (this.root == null){
            this.root = new Node(value);
        } else {
            findPlace(value, this.root);
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
        if (node.getBigger() != null){
            max(node.getBigger());
        }
        return node.getValue();
    }

    public int min(){
        return min(this.root);
    }

    private int min(Node node){
        if (node.getSmaller() != null){
            max(node.getSmaller());
        }
        return node.getValue();
    }

    private void findPlace (int value, Node root){
        if (value > root.getValue()){
            if (root.getBigger() == null){
                root.getBigger().setValue(value);
            } else {
                findPlace(value, root.getBigger());
            }
        } else if (value < root.getValue()){
            if (root.getSmaller() == null){
                root.getSmaller().setValue(value);
            } else {
                findPlace(value, root.getSmaller());
            }
        }
    }
}
