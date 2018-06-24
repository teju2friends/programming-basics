package com.pulsethought.learn.algirithems;

public class BinaryTree<T extends Comparable> {

    private Node<T> root;

    public void addValue(T value) {
        if (null == root) {
            root = new Node<T>(value);
            return;
        }

        addValue(value, root);
    }

    private void addValue(T value, Node node) {
        if (value.compareTo(node.getData()) < 0) {
            Node leftNode = node.getLeftNode();
            if (null == leftNode)
                node.addLeftNode(value);
            else
                addValue(value, leftNode);
        } else {
            Node rightNode = node.getRightNode();
            if (null == rightNode)
                node.addRightNode(value);
            else
                addValue(value, rightNode);
        }
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}


class Node<T extends Comparable> {
    private T data;
    private Node leftNode;
    private Node righttNode;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return righttNode;
    }

    public void setRighttNode(Node righttNode) {
        this.righttNode = righttNode;
    }

    public void addRightNode(T data) {
        this.righttNode = new Node(data);
    }

    public void addLeftNode(T data) {
        this.leftNode = new Node(data);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", leftNode=" + leftNode +
                ", righttNode=" + righttNode +
                '}';
    }
}