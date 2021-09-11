package operations;

import node.Node;

public class PrintHeap {

    public void postOrderHeapTraversal(Node root) {
        if (root == null)
            return;
        postOrderHeapTraversal(root.getLeft());
        System.out.print(root.getData() + "  ");
        postOrderHeapTraversal(root.getRight());
    }
}
