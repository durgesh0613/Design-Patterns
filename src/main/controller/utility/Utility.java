package main.controller.utility;

import main.model.TreeNode;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Utility {

    public static int findHeight(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = findHeight(root.getLeft()) + 1;
        int rightHeight = findHeight(root.getRight()) + 1;
        return Math.max(leftHeight, rightHeight);
    }

    /**
     * printTree() - Prints the arrayList received as input. It also can filter according to the
     * condition/predicate provided in the second parameter.
     * @param resultTree - ArrayList to be printed
     * @param filterCondition - Predicate/Condition used for filtering
     * @return Either the message string or the ArrayList
     */
    public static String printTree(ArrayList<Integer> resultTree, Predicate filterCondition){
        if(filterCondition != null){
            resultTree = filter(resultTree, filterCondition);
        }
        if(resultTree == null || resultTree.isEmpty()){
            String message = "No elements in the tree";
            System.out.println(message);
            return message;
        }
        System.out.println(resultTree);
        return resultTree.toString();
    }

    /**
     * filter() --> Takes the ArrayList as input and filters it based on the Predicate/Condition
     * @param resultTree - Input ArrayList
     * @param filterCondition - Predicate for filter
     * @return  Filtered ArrayList
     */
    public static ArrayList<Integer> filter(ArrayList<Integer> resultTree, Predicate<Integer> filterCondition) {
        resultTree = (ArrayList<Integer>) resultTree
                .stream()
                .filter(filterCondition)
                .collect(Collectors.toList());
        return resultTree;
    }

}
