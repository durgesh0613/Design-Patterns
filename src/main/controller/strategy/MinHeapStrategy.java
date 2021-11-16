package main.controller.strategy;

import main.controller.TreeManipulation;
import main.controller.iterator.HeapIterator;
import main.model.TreeNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.function.Consumer;

public class MinHeapStrategy extends PriorityQueue implements HeapStrategy {
    TreeNode root;

    public MinHeapStrategy(TreeNode root) {
        this.root = root;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(Object node : this){
            result.append((TreeNode)node).append(" ");
        }
        return result.toString();
    }

    @Override
    public boolean add(Object newValue) {
        try{
            Integer newVal = (Integer)newValue;
            new TreeManipulation(this).insert(new TreeNode(newVal));
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Object[] toArray() {
        ArrayList result = new ArrayList<TreeNode>();
        for(Object node : this){
            result.add(node);
        }
        return result.toArray();
    }

    /**
     * Returns an iterator over the elements in this heap. The iterator
     * returns the elements in in-order traversal
     *
     * @return an iterator over the elements in this heap
     */
    public Iterator iterator() {
        return new HeapIterator(this);
    }

    public Iterator oddIterator() {
        return new HeapIterator(this);
    }

    @Override
    public boolean rootReplaceable(TreeNode root, TreeNode newNode) {
        if (newNode.getData() < root.getData())
            return true;
        return false;
    }

    @Override
    public TreeNode getRoot() {
        return root;
    }

    @Override
    public void setRoot(TreeNode newNode) {
        this.root = newNode;
    }
}
