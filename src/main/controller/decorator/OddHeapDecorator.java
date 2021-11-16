package main.controller.decorator;

import main.controller.strategy.HeapStrategy;
import main.controller.utility.Constants;
import main.controller.utility.Utility;
import main.model.TreeNode;

import java.util.ArrayList;

/**
 * Concrete Decorator that filters the odd elements from min or max heap.
 */
public class OddHeapDecorator extends HeapDecorator{
    HeapStrategy heapStrategy;

    /**
     * Initializes min or max heap strategy
     * @param heapStrategy
     */
    public OddHeapDecorator(HeapStrategy heapStrategy){
        super(heapStrategy);
        this.heapStrategy = heapStrategy;
    }

    /**
     * Compares the root and newNode to decide insertion pattern.
     * @param root
     * @param newNode
     * @return
     */
    @Override
    public boolean rootReplaceable(TreeNode root, TreeNode newNode) {
        return heapStrategy.rootReplaceable(root, newNode);
    }

    /**
     * Used to access root in internal classes/methods
     * @return
     */
    @Override
    public TreeNode getRoot() {
        return heapStrategy.getRoot();
    }

    /**
     * Used to set root in internal classes/methods.
     * @param newNode
     */
    @Override
    public void setRoot(TreeNode newNode) {
        heapStrategy.setRoot(newNode);
    }

    /**
     * Used to add an element to heap
     * @param o
     * @return
     */
    @Override
    public boolean add(Object o) {
        return heapStrategy.add(o);
    }

    /**
     * Used to convert all heap elements to array (odd)
     * @return
     */
    @Override
    public Object[] toArray() {
        Object heapElements[] = heapStrategy.toArray();
        ArrayList<Integer> heapList = new ArrayList<>();
        for(Object element : heapElements){
            TreeNode node = (TreeNode)element;
            heapList.add(node.getData());
        }
        return Utility.filter(heapList, Constants.isOdd).toArray();
    }

    /**
     * Used to convert all elements to String (odd)
     * @return
     */
    @Override
    public String toString() {
        Object heapElements[] = heapStrategy.toArray();
        ArrayList<Integer> heapList = new ArrayList<>();
        for(Object element : heapElements){
            TreeNode node = (TreeNode)element;
            heapList.add(node.getData());
        }
        return Utility.filter(heapList, Constants.isOdd).toString();
    }
}
