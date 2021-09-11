package operations;

import node.Node;
import utility.Utility;

public class Insertion {
    public Node insert(Node root, Node newNode) {
        if (root == null)
            return newNode;
        beginInsertion(root, newNode);
        return root;
    }

    public Node beginInsertion(Node root, Node newNode) {
        if (newNode.getData() < root.getData()) {
            //Making Smallest Value as the root
            int smallestValue = newNode.getData();
            newNode.setData(root.getData());
            root.setData(smallestValue);
        }

        int leftHeight = Utility.findHeight(root.getLeft());
        int rightHeight = Utility.findHeight(root.getRight());

        if (leftHeight <= rightHeight) { //Adding the new node to the left subHeap
            if (leftHeight == 0)
                root.setLeft(newNode);
            else
                beginInsertion(root.getLeft(), newNode);
        } else { //Adding the new node to the right subHeap
            if (rightHeight == 0)
                root.setRight(newNode);
            else
                beginInsertion(root.getRight(), newNode);
        }
        return root;
    }
}
