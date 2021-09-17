package main;

import main.controller.utility.Utility;
import main.model.TreeNode;
import main.controller.TreeManipulation;
import main.controller.TreeTraversal;

import java.util.ArrayList;
import java.util.Scanner;

import static main.controller.utility.Constants.isOdd;

//MinHeap Main Class (Driver Class)
public class MinHeapTree {
    private static TreeNode root;
    private static ArrayList<Integer> resultTree;
    private static TreeManipulation treeManipulation = new TreeManipulation();
    private static TreeTraversal traversal = new TreeTraversal();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Enter your Choice");
            System.out.println("1 for inserting a new node in a MINHEAP");
            System.out.println("2 for Printing MINHEAP in Post-Order format");
            System.out.println("3 for Printing Odd elements of a MINHEAP in Pre-Order format");
            System.out.println("9 for Exiting");
            choice = sc.nextInt();
            doOperations(choice);
        } while (choice != 9);
    }

    private static void doOperations(int choice) {
        switch (choice) {
            case 1:
                //Inserting a new node
                Scanner sc = new Scanner(System.in);
                System.out.println("\nEnter node value to be entered in the MINHEAP");
                int nodeValue = sc.nextInt();
                root = treeManipulation.insert(root, new TreeNode(nodeValue));
                System.out.println(nodeValue + " is Inserted in the MINHEAP");
                break;
            case 2:
                //Printing values in post order traversal
                System.out.println("\nPrinting values in post-order traversal.");
                traversal.clearResult();
                resultTree = traversal.postOrderHeapTraversal(root);
                Utility.printTree(resultTree, null);
                break;
            case 3:
                //Printing values in pre order traversal
                System.out.println("\nPrinting odd values in pre-order traversal.");
                traversal.clearResult();
                resultTree = traversal.preOrderHeapTraversal(root);
                Utility.printTree(resultTree, isOdd);
                break;
            case 9:
                System.out.println("Exiting. Thank you!");
        }
    }
}
