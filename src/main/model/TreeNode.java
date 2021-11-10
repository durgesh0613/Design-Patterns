package main.model;

public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        left = new TreeNodeNull();
        right = new TreeNodeNull();
    }

    protected TreeNode() {
    }

    //Finds the height of the binary
    //Used while inserting a new node in the minHeap.
    public static int findHeight(TreeNode root) {
        if (root.isNull())
            return 0; // If the root is null, height is zero.
        int leftHeight = findHeight(root.getLeft()) + 1;
        int rightHeight = findHeight(root.getRight()) + 1;
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
