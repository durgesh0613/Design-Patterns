package main.controller.iterator;

import main.controller.strategy.HeapStrategy;
import main.model.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * External iterator to iterate min or max heap.
 */
public class HeapIterator implements Iterator {

    Deque<TreeNode> stack;
    TreeNode currentNode;

    public HeapIterator(HeapStrategy heapStrategy) {
        stack = new ArrayDeque<>();
        currentNode = heapStrategy.getRoot();
    }

    /**
     * Checks if next element is present.
     * @return
     */
    @Override
    public boolean hasNext() {
        return !stack.isEmpty() || !currentNode.isNull();
    }

    /**
     * Returns the next node.
     * @return
     */
    @Override
    public TreeNode next() {
        TreeNode result = null;
        while (hasNext()){
            if(!currentNode.isNull()){
                //first time
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            }else{
                //second time
                currentNode = stack.pop();
                result = currentNode;
                currentNode = currentNode.getRight();
                break;
            }
        }
        return result;
    }
}
