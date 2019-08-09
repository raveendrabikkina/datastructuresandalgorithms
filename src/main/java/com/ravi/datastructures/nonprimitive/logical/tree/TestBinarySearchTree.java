package com.ravi.datastructures.nonprimitive.logical.tree;

import com.ravi.algorithms.tree.binarysearchtree.recursive.BalancedBinarySearchTree;
import com.ravi.algorithms.tree.binarysearchtree.recursive.breadthfirstsearch.BreadthFirstSearch;
import com.ravi.algorithms.tree.binarysearchtree.recursive.depthfirstsearch.DepthFirstSearch;

public class TestBinarySearchTree {

    public static void main(String[] args) {

        int[] numbers = {1, 4, 2, 7, 3, 10, 12, 6, 8, 5, 9, 11};
        BalancedBinarySearchTree balancedBinarySearchTree = new BalancedBinarySearchTree();
        Node balancedBST = balancedBinarySearchTree.createBalancedBinarySearchTreeFromUnsortedArray(numbers);

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        System.out.println("InOrder traversal of Binary Search Tree:");
        depthFirstSearch.inOrderTraverseBST(balancedBST);

        System.out.println("\nPreOrder traversal of Binary Search Tree:");
        depthFirstSearch.preOrderTraverseBST(balancedBST);

        System.out.println("\nPostOrder traversal of Binary Search Tree:");
        depthFirstSearch.postOrderTraverseBST(balancedBST);

        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        System.out.println("\nlevelOrder traversal of Binary Search Tree:");
        breadthFirstSearch.levelOrderTraversal(balancedBST);

        int elementToFind = 12;
        System.out.println("\nFind " + elementToFind + " in Binary Search Tree:");
        balancedBinarySearchTree.findAnElement(balancedBST, elementToFind);

        System.out.println("\nFind " + elementToFind + " in Binary Search Tree using Breadth First Search:");
        breadthFirstSearch.levelOrderSearch(balancedBST, elementToFind);
    }
}
