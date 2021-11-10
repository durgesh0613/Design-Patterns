package main.model;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class TreeNode implements Queue {
    private int data;
    private TreeNode left;
    private TreeNode right;
    private int size;

    public TreeNode(int data) {
        this.data = data;
    }

    //Getters and Setters
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public TreeNode getLeft() {
        return left;
    }
    public void setLeft(TreeNode left) {
        this.left = left;
    }
    public TreeNode getRight() {
        return right;
    }
    public void setRight(TreeNode right) {
        this.right = right;
    }
}
