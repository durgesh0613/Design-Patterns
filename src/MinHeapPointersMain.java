import node.Node;
import operations.Insertion;
import operations.PrintHeap;
import operations.Traversal;

public class MinHeapPointersMain {
    private static Node root;

    public static void main(String[] args) {
        Insertion insertion = new Insertion();
        Traversal traversal = new Traversal();

        //Constructing Dummy Min Heap as per the Prompt for testing
        root = new Node(45);
        Node a = new Node(65);
        Node b = new Node(72);
        Node c = new Node(90);
        Node d = new Node(81);
        Node e = new Node(82);
        Node f = new Node(96);
        Node g = new Node(99);
        Node h = new Node(95);

        root.setLeft(a);
        root.setRight(b);

        a.setLeft(c);
        a.setRight(d);

        c.setLeft(g);
        c.setRight(h);

        b.setLeft(e);
        b.setRight(f);
        // tree construction ends

        root = insertion.insert(root, new Node(50));
        new PrintHeap().postOrderHeapTraversal(root);
        System.out.println("\nPrinting odd values in pre-order traversal.");
        traversal.preOrderHeapTraversalWithOddValues(root);
    }
}
