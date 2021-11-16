package main.model;

public class TreeNodeNull extends TreeNode {
    public boolean isNull() {
        return true;
    }

    public int getHeight() {
        return 0;
    }
}