package main.controller.iterator;

import main.controller.strategy.HeapStrategy;
import main.model.TreeNode;
import main.model.TreeNodeNull;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class OddFilter implements Iterator {
    private Iterator iterator;
    TreeNode current = new TreeNodeNull();

    public OddFilter(Iterator itr) {
        this.iterator = itr;
    }

    @Override
    public TreeNode next() {
        return current;
    }

    @Override
    public boolean hasNext() {
        while (iterator.hasNext()) {
            current = (TreeNode) iterator.next();
            if (current.getData() % 2 != 0)
                return true;
        }
        return false;
    }
}
