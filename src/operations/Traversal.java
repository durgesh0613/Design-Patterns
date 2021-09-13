package operations;

import node.Node;

public class Traversal {

    public void preOrderHeapTraversalWithOddValues(Node root) {
        if (root == null)
            return;
        int value = root.getData();
        if (value % 2 == 1){
            System.out.print(value + "  ");
        }
        preOrderHeapTraversalWithOddValues(root.getLeft());
        preOrderHeapTraversalWithOddValues(root.getRight());
    }
}
