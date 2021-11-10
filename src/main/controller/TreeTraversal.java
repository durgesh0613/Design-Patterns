package main.controller;

import main.model.TreeNode;

import java.util.ArrayList;

public class TreeTraversal {
    private ArrayList<Integer> resultTree;

    public TreeTraversal() {
        resultTree = new ArrayList<Integer>();
    }

    /**
     * Getter for resultTree
     *
     * @return
     */
    public ArrayList<Integer> getResultTree() {
        return resultTree;
    }

    /**
     * Setter for resultTree
     *
     * @param resultTree
     */
    public void setResultTree(ArrayList<Integer> resultTree) {
        this.resultTree = resultTree;
    }

    /**
     * clearResult() - Used to reset the resultTree ArrayList
     */
    public void clearResult() {
        resultTree.clear();
    }

    /**
     * It returns the list of values in post order for the tree.
     *
     * @param root
     * @return
     */
    public ArrayList<Integer> postOrderHeapTraversal(TreeNode root) {
        if (root.isNull())
            return null;

        postOrderHeapTraversal(root.getLeft());
        postOrderHeapTraversal(root.getRight());
        resultTree.add(root.getData());
        return resultTree;
    }

    /**
     * It returns the list of values in pre order for the tree.
     *
     * @param root
     * @return
     */
    public ArrayList<Integer> preOrderHeapTraversal(TreeNode root) {
        if (root.isNull())
            return null;

        resultTree.add(root.getData());
        preOrderHeapTraversal(root.getLeft());
        preOrderHeapTraversal(root.getRight());
        return resultTree;
    }
}
