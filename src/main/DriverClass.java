package main;

import main.controller.decorator.HeapDecorator;
import main.controller.decorator.OddHeapDecorator;
import main.controller.iterator.OddFilter;
import main.controller.utility.Utility;
import main.model.TreeNode;
import main.controller.TreeManipulation;
import main.controller.TreeTraversal;
import main.model.TreeNodeNull;
import main.controller.strategy.MaxHeapStrategy;
import main.controller.strategy.MinHeapStrategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import static main.controller.utility.Constants.isOdd;

/**
 * @author Durgesh Valecha - 027981653
 * @author Ankit Pattanayak - 027646357
 */

//MinHeap Main Class (Driver Class)
public class DriverClass {
    private static TreeNode rootMinHeap = new TreeNodeNull();
    private static TreeNode rootMaxHeap = new TreeNodeNull();
    private static ArrayList<Integer> resultTree;
    private static TreeManipulation treeManipulation;
    private static TreeTraversal traversal = new TreeTraversal();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Enter your Choice");
            System.out.println("1 for inserting a new node in a MINHEAP");
            System.out.println("2 for Printing MINHEAP in Post-Order format");
            System.out.println("3 for Printing Odd elements of a MINHEAP in Pre-Order format");

            System.out.println("4 for inserting a new node in a MAXHEAP");
            System.out.println("5 for Printing MAXHEAP in Post-Order format");
            System.out.println("6 for Printing Odd elements of a MAXHEAP in Pre-Order format");

            System.out.println("7 for printing MAXHEAP using External Iterator");
            System.out.println("8 for printing MAXHEAP using Internal Iterator");
            System.out.println("9 for printing MAXHEAP using OddHeapDecorator");
            System.out.println("10 for printing MAXHEAP using OddFilter");
            System.out.println("11 for Exiting");
            choice = sc.nextInt();
            doOperations(choice);
        } while (choice != 9);
    }

    private static void doOperations(int choice) {
        switch (choice) {
            case 1:
                //Inserting a new node in a MIN HEAP

                Scanner sc = new Scanner(System.in);
                System.out.println("\nEnter node value to be entered in the MINHEAP");
                int nodeValue = sc.nextInt();
                treeManipulation = new TreeManipulation(new MinHeapStrategy(rootMinHeap));
                rootMinHeap = treeManipulation.insert(new TreeNode(nodeValue));
                System.out.println(nodeValue + " is Inserted in the MINHEAP");
                break;

            case 2:
                //Printing values in post order traversal - MINHEAP

                System.out.println("\nPrinting values in post-order traversal.");
                traversal.clearResult();
                resultTree = traversal.postOrderHeapTraversal(rootMinHeap);
                Utility.printTree(resultTree, null);
                break;
            case 3:
                //Printing values in pre order traversal - MINHEAP

                System.out.println("\nPrinting odd values in pre-order traversal.");
                traversal.clearResult();
                resultTree = traversal.preOrderHeapTraversal(rootMinHeap);
                Utility.printTree(resultTree, isOdd);
                break;

            case 4:
                //Inserting a new node in a MAX HEAP

                sc = new Scanner(System.in);
                System.out.println("\nEnter node value to be entered in the MAXHEAP");
                nodeValue = sc.nextInt();
                treeManipulation = new TreeManipulation(new MaxHeapStrategy(rootMaxHeap));
                rootMaxHeap = treeManipulation.insert(new TreeNode(nodeValue));
                System.out.println(nodeValue + " is Inserted in the MAXHEAP");
                break;

            case 5:
                //Printing values in post order traversal - MAXHEAP

                System.out.println("\nPrinting values in post-order traversal.");
                traversal.clearResult();
                resultTree = traversal.postOrderHeapTraversal(rootMaxHeap);
                Utility.printTree(resultTree, null);
                break;
            case 6:
                //Printing values in pre order traversal - MAXHEAP

                System.out.println("\nPrinting odd values in pre-order traversal.");
                traversal.clearResult();
                resultTree = traversal.preOrderHeapTraversal(rootMaxHeap);
                Utility.printTree(resultTree, isOdd);
                break;

            case 7:
                //Using external iterator to print in in-order fashion
                System.out.println("\nPrinting values in in-order traversal.");
                Iterator maxHeapItr = new MaxHeapStrategy(rootMaxHeap).iterator();
                while (maxHeapItr.hasNext()) {
                    TreeNode node = (TreeNode) maxHeapItr.next();
                    if (!node.isNull()) {
                        System.out.println(node.getData());
                    }
                }
            case 8:
                //Using internal iterator to print in in-order fashion
                for (Object node : new MaxHeapStrategy(rootMaxHeap)) {
                    System.out.println(((TreeNode) node).getData());
                }
                break;
            case 9:
                //Oddheapdecorator with max heap
                HeapDecorator oddHeapDecorator = new OddHeapDecorator(new MaxHeapStrategy(rootMaxHeap));
                System.out.println(oddHeapDecorator);
                break;
            case 10:
                //Using external iterator to print the odd elements in in-order fashion
                System.out.println("\nPrinting values in in-order traversal.");
                Iterator itr = new MaxHeapStrategy(rootMaxHeap).iterator();
                Iterator oddFilterIterator = new OddFilter(itr);
                while (oddFilterIterator.hasNext()) {
                    TreeNode node = (TreeNode) oddFilterIterator.next();
                    if (!node.isNull()) {
                        System.out.println(node.getData());
                    }
                }
            case 11:
                //Oddheapdecorator with max heap
                HeapDecorator oddHeapDecorator2 = new OddHeapDecorator(new MinHeapStrategy(rootMinHeap));
                System.out.println(oddHeapDecorator2);
                break;
            case 12:
                System.out.println("Exiting. Thank you!");
                break;
            default:
                System.out.println("Incorrect Choice. Please try again!");
        }
    }
}
