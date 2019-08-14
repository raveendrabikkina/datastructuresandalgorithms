package com.ravi.algorithms.tree.binarysearchtree.recursive;

import com.ravi.datastructures.nonprimitive.nonlinear.tree.Node;

import java.util.Arrays;

public class BalancedBinarySearchTree {

    public Node createBalancedBinarySearchTreeFromUnsortedArray(int[] dataArray) {

        System.out.println("Sorting an unsorted array...");
        Arrays.sort(dataArray);
        System.out.println("Creating Balanced Binary Search Tree...");

        return createBalancedBinarySearchTree(0, dataArray.length - 1, dataArray);
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

    public void findAnElement(Node node, int elementToFind) {
        if (node == null) {
            System.out.println("Not Found");
        } else if (node.getData() == elementToFind) {
            System.out.println("Found");
        } else if (elementToFind > node.getData()) {
            findAnElement(node.getRightNode(), elementToFind);
        } else if (elementToFind < node.getData()) {
            findAnElement(node.getLeftNode(), elementToFind);
        }
    }
}