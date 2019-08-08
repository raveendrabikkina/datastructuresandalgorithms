package com.ravi.datastructures.tree.binarysearchtree;

import java.util.Objects;

public class Node {

    private int counter;
    private int data;
    private Node leftNode;
    private Node rightNode;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o || !(o instanceof Node)) {
            return true;
        }
        Node node = (Node) o;
        return getData() == node.getData();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getData());
    }
}
