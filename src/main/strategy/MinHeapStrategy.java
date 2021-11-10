package main.strategy;

import main.model.TreeNode;

public class MinHeapStrategy implements Strategy {
    @Override
    public boolean rootReplaceable(TreeNode root, TreeNode newNode) {
        if (newNode.getData() < root.getData())
            return true;
        return false;
    }
}
