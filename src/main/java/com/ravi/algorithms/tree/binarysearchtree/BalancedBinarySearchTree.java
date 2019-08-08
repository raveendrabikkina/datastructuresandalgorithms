package com.ravi.algorithms.tree.binarysearchtree;

import com.ravi.datastructures.tree.binarysearchtree.Node;

import java.util.Arrays;

public class BalancedBinarySearchTree {

    public Node createBalancedBinarySearchTreeFromUnsortedArray(int[] dataArray) {
        System.out.println("Sorting an unsorted array...");
        Arrays.sort(dataArray);
        System.out.println("Creating Balanced Binary Search Tree...");
        Node balanceBinarySearchTree = createBalancedBinarySearchTree(0, dataArray.length - 1, dataArray);

        return balanceBinarySearchTree;
    }

    public Node createBalancedBinarySearchTree(int startIndex, int endIndex, int[] dataArray) {

        if (startIndex > endIndex) {
            return null;
        }
        Node node = new Node();
        int mid = (endIndex + startIndex) / 2;
        node.setData(dataArray[mid]);
        node.setLeftNode(createBalancedBinarySearchTree(startIndex, mid - 1, dataArray));
        node.setRightNode(createBalancedBinarySearchTree(mid + 1, endIndex, dataArray));

        return node;
    }

    /**
     * L,P,R
     *
     * @param node
     */
    public void inOrderTraverseBST(Node node) {

        if (node == null) {
            return;
        }
        inOrderTraverseBST(node.getLeftNode());
        System.out.print(node.getData() + ", ");
        inOrderTraverseBST(node.getRightNode());
    }


    /**
     * P,L,R
     *
     * @param node
     */
    public void preOrderTraverseBST(Node node) {

        if (node == null) {
            return;
        }
        System.out.print(node.getData() + ", ");
        preOrderTraverseBST(node.getLeftNode());
        preOrderTraverseBST(node.getRightNode());
    }

    /**
     * L,R,P
     *
     * @param node
     */
    public void postOrderTraverseBST(Node node) {

        if (node == null) {
            return;
        }
        postOrderTraverseBST(node.getLeftNode());
        postOrderTraverseBST(node.getRightNode());
        System.out.print(node.getData() + ", ");
    }


    public String findAnElement(Node node, int elementToFind) {
        String result = null;
        if (node == null) {
            return "Not Found";
        } else if (node.getData() == elementToFind) {
            return "Found";
        } else if (elementToFind > node.getData()) {
            result = findAnElement(node.getRightNode(), elementToFind);
        } else if (elementToFind < node.getData()) {
            result = findAnElement(node.getLeftNode(), elementToFind);
        }
        return result;
    }
}