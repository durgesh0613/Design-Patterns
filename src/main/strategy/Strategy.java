package main.strategy;

import main.model.TreeNode;

public interface Strategy {
    public boolean rootReplaceable(TreeNode root, TreeNode newNode);

}
