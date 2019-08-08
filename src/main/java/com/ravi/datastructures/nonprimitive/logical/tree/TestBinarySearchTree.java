package com.ravi.datastructures.nonprimitive.logical.tree;

import com.ravi.algorithms.tree.binarysearchtree.BalancedBinarySearchTree;

public class TestBinarySearchTree {

    public static void main(String[] args) {

        int[] numbers = {1, 4, 2, 7, 3, 10, 12, 6, 8, 5, 9, 11};
        BalancedBinarySearchTree balancedBinarySearchTree = new BalancedBinarySearchTree();
        Node balancedBST = balancedBinarySearchTree.createBalancedBinarySearchTreeFromUnsortedArray(numbers);

        System.out.println("InOrder traversal of Binary Search Tree:");
        balancedBinarySearchTree.inOrderTraverseBST(balancedBST);

        System.out.println("\nPreOrder traversal of Binary Search Tree:");
        balancedBinarySearchTree.preOrderTraverseBST(balancedBST);

        System.out.println("\nPostOrder traversal of Binary Search Tree:");
        balancedBinarySearchTree.postOrderTraverseBST(balancedBST);

        int elementToFind = 12;
        System.out.println("\nFind " + elementToFind + " in Binary Search Tree:");
        balancedBinarySearchTree.findAnElement(balancedBST, elementToFind);
    }
}
