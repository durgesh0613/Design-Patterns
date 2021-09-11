package utility;

import node.Node;

public class Utility {

    public static int findHeight(Node root) {
        if (root == null)
            return 0;
        int leftHeight = findHeight(root.getLeft()) + 1;
        int rightHeight = findHeight(root.getRight()) + 1;
        return Math.max(leftHeight, rightHeight);
    }
}
