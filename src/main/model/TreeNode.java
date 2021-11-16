package main.model;

public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;
    private int size;

    public TreeNode(int data) {
        this.data = data;
        left = new TreeNodeNull();
        right = new TreeNodeNull();
    }

    protected TreeNode() {
    }

    //Finds the height of the binary
    //Used while inserting a new node in the minHeap.
    public int getHeight() {
        int leftHeight = this.getLeft().getHeight() + 1;
        int rightHeight = this.getRight().getHeight() + 1;
        return Math.max(leftHeight, rightHeight);
    }

    public boolean isNull() {
        return false;
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
