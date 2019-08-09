package com.ravi.algorithms.tree.binarysearchtree.recursive.breadthfirstsearch;

import com.ravi.datastructures.nonprimitive.logical.tree.Node;

import java.util.LinkedList;
import java.util.Queue;

import static java.util.Objects.nonNull;

public class BreadthFirstSearch {

    private final Queue<Node> bfsQueue = new LinkedList<>();

    /**
     * Prefer level order traversal to depth first traversal while search for an element in a binary tree.
     * This is because we've used queue and it's faster than system stack(for pre,post and inorder traversal)
     *
     * @param root - Root node of binary search tree
     */
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
            System.out.print(node.getData() + ", ");
        }
    }
}
