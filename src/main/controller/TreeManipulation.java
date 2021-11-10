package main.controller;

import main.model.TreeNode;
import main.controller.utility.Utility;
import main.strategy.Strategy;
import sun.reflect.generics.tree.Tree;

/**
 * TreeManipulation class currently supports insertion to satisfy min-heap nature of the tree.
 */
public class TreeManipulation {
    private Strategy strategy;

    public TreeManipulation(Strategy strategy) {
        this.strategy = strategy;
    }

    //Can be overloaded to support insertion of lists in the future.
    //Gets called from the driver class to insert a node in the tree.
    public TreeNode insert(TreeNode root, TreeNode newNode) {
        if (root.isNull())
            return newNode;
        beginInsertion(root, newNode);
        return root;
    }

    //Recursive method to insert new node as per the prompt
    private TreeNode beginInsertion(TreeNode root, TreeNode newNode) {
        if (strategy.rootReplaceable(root, newNode)) {
            int newValue = newNode.getData();
            newNode.setData(root.getData());
            root.setData(newValue);
        }

        int leftHeight = TreeNode.findHeight(root.getLeft());
        int rightHeight = TreeNode.findHeight(root.getRight());

        if (leftHeight <= rightHeight) { //New Node will be added to the left subHeap
            if (leftHeight == 0) // If the node has no children, simply add new node as it's child
                root.setLeft(newNode);
            else
                beginInsertion(root.getLeft(), newNode);
        } else { //Adding the new node to the right subHeap
            if (rightHeight == 0)
                root.setRight(newNode);// If the node has no children, simply add new node as it's child
            else
                beginInsertion(root.getRight(), newNode);
        }
        return root;
    }

    public TreeNode update(TreeNode root) {
        /**
         * To be implemented in future
         */
        return root;
    }

    public TreeNode delete(TreeNode root) {
        /**
         * To be implemented in future
         */
        return root;
    }
}
