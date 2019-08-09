package com.ravi.algorithms.tree.binarysearchtree.recursive.depthfirstsearch;

import com.ravi.datastructures.nonprimitive.logical.tree.Node;

public class DepthFirstSearch {

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

}
