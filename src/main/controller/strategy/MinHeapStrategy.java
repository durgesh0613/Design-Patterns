package main.controller.strategy;

import main.model.TreeNode;

import java.util.PriorityQueue;

public class MinHeapStrategy extends PriorityQueue implements HeapStrategy {
    TreeNode root;

    public MinHeapStrategy(TreeNode root) {
        this.root = root;
    }

    @Override
    public boolean rootReplaceable(TreeNode root, TreeNode newNode) {
        if (newNode.getData() < root.getData())
            return true;
        return false;
    }

    @Override
    public TreeNode getRoot() {
        return root;
    }

    @Override
    public void setRoot(TreeNode newNode) {
        this.root = newNode;
    }
}
