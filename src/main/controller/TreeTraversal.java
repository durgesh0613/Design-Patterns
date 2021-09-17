package main.controller;

import main.model.TreeNode;

import java.util.ArrayList;

public class TreeTraversal {
    private ArrayList<Integer> resultTree;

    public TreeTraversal(){
        resultTree = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getResultTree() {
        return resultTree;
    }

    public void setResultTree(ArrayList<Integer> resultTree) {
        this.resultTree = resultTree;
    }

    public void clearResult(){
        resultTree.clear();
    }


    //Printing the nodes of the minHeap in LEFT -> RIGHT -> ROOT format.
    public ArrayList<Integer> postOrderHeapTraversal(TreeNode root) {
        if (root == null)
            return null;

        postOrderHeapTraversal(root.getLeft());
        postOrderHeapTraversal(root.getRight());
        resultTree.add(root.getData());
        return resultTree;
    }

    //Printing the nodes of the minHeap in ROOT -> LEFT -> RIGHT format.
    public ArrayList<Integer> preOrderHeapTraversal(TreeNode root) {
        if (root == null)
            return null;

        resultTree.add(root.getData());
        preOrderHeapTraversal(root.getLeft());
        preOrderHeapTraversal(root.getRight());
        return resultTree;
    }
}
