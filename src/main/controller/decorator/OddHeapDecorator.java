package main.controller.decorator;

import main.controller.strategy.HeapStrategy;
import main.controller.utility.Constants;
import main.controller.utility.Utility;
import main.model.TreeNode;

import java.util.ArrayList;
import java.util.Collections;

public class OddHeapDecorator extends HeapDecorator{
    HeapStrategy heapStrategy;

    public OddHeapDecorator(HeapStrategy heapStrategy){
        super(heapStrategy);
        this.heapStrategy = heapStrategy;
    }

    @Override
    public boolean rootReplaceable(TreeNode root, TreeNode newNode) {
        return heapStrategy.rootReplaceable(root, newNode);
    }

    @Override
    public TreeNode getRoot() {
        return heapStrategy.getRoot();
    }

    @Override
    public void setRoot(TreeNode newNode) {
        heapStrategy.setRoot(newNode);
    }

    @Override
    public boolean add(Object o) {
        return heapStrategy.add(o);
    }

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
