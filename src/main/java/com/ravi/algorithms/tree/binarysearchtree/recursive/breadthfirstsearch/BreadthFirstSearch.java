package com.ravi.algorithms.tree.binarysearchtree.recursive.breadthfirstsearch;

import com.ravi.datastructures.nonprimitive.logical.tree.Node;

import java.util.LinkedList;
import java.util.Queue;

import static java.util.Objects.nonNull;

public class BreadthFirstSearch {

    Queue<Node> bfsQueue = new LinkedList<>();

    public void levelOrderTraversal(Node root) {
        bfsQueue.offer(root);

        while (!bfsQueue.isEmpty()) {
            Node node = bfsQueue.poll();
            if (nonNull(node.getLeftNode())) {
                bfsQueue.offer(node.getLeftNode());
            }
            if (nonNull(node.getRightNode())) {
                bfsQueue.offer(node.getRightNode());
            }
            if (nonNull(node)) {
                System.out.print(node.getData() + ", ");
            }
        }
    }
}
