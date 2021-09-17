package main;

import main.controller.utility.Utility;
import main.model.TreeNode;
import main.controller.TreeManipulation;
import main.controller.TreeTraversal;

import java.util.ArrayList;

import static main.controller.utility.Constants.isOdd;

public class MinHeapTree {
    private static TreeNode root;
    private static ArrayList<Integer> resultTree;

    public static void main(String[] args) {
        TreeManipulation treeManipulation = new TreeManipulation();
        TreeTraversal traversal = new TreeTraversal();

        //Create a dummy tree with certain values
        //Utility.createTree();

        //Insert 50 as a value and maintain min-heap structure
        root = treeManipulation.insert(root, new TreeNode(50));

        //Printing values in post order traversal
        System.out.println("\nPrinting values in post-order traversal.");
        traversal.clearResult();
        resultTree = traversal.postOrderHeapTraversal(root);
        Utility.printTree(resultTree, null);

        //Printing values in pre order traversal
        System.out.println("\nPrinting odd values in pre-order traversal.");
        traversal.clearResult();
        resultTree = traversal.preOrderHeapTraversal(root);
        Utility.printTree(resultTree, isOdd);
    }
}
