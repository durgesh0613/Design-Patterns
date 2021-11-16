package main.controller.strategy;

import main.model.TreeNode;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public interface HeapStrategy{
    TreeNode root = null;

    boolean rootReplaceable(TreeNode root, TreeNode newNode);

    TreeNode getRoot();

    void setRoot(TreeNode newNode);

    boolean add(Object o);

    Object[] toArray();
}
