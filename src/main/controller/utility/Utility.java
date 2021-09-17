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

    public static String printTree(ArrayList<Integer> resultTree, Predicate filterCondition){
        if(filterCondition != null){
            resultTree = filter(resultTree, filterCondition);
        }
        if(resultTree == null || resultTree.isEmpty()){
            System.out.println("No elements in the tree");
        }
        System.out.println(resultTree);
        return resultTree.toString();
    }

    public static ArrayList<Integer> filter(ArrayList<Integer> resultTree, Predicate<Integer> filterCondition) {
        resultTree = (ArrayList<Integer>) resultTree
                .stream()
                .filter(filterCondition)
                .collect(Collectors.toList());
        return resultTree;
    }

    public static TreeNode createDummyTree(){
        //Constructing Dummy Min Heap as per the Prompt for testing
        TreeNode root = new TreeNode(45);
        TreeNode a = new TreeNode(65);
        TreeNode b = new TreeNode(72);
        TreeNode c = new TreeNode(90);
        TreeNode d = new TreeNode(81);
        TreeNode e = new TreeNode(82);
        TreeNode f = new TreeNode(96);
        TreeNode g = new TreeNode(99);
        TreeNode h = new TreeNode(95);

        root.setLeft(a);
        root.setRight(b);

        a.setLeft(c);
        a.setRight(d);

        c.setLeft(g);
        c.setRight(h);

        b.setLeft(e);
        b.setRight(f);
        // tree construction ends

        return root;
    }

}
