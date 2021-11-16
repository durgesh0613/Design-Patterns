package test;

import main.controller.TreeManipulation;
import main.controller.TreeTraversal;
import main.controller.strategy.MinHeapStrategy;
import main.model.TreeNode;
import main.model.TreeNodeNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.TestConstantsMinHeap.emptyTreeInsertionTestResult;
import static test.TestConstantsMinHeap.preOrderAfterInsertionTestResult;

/**
 * Test class for TreeManipulation : MIN HEAP
 */
public class MinHeapTreeManipulationTest {
    TreeNode root;
    TreeNode newNode;
    TreeTraversal treeTraversal;
    TreeManipulation treeManipulation;

    /**
     * Re-initializes root of the tree and initializes the necessary objects.
     */
    @BeforeEach
    void setUp() {
        root = TestUtility.createDummyMinHeap();
        newNode = new TreeNode(50);
        treeTraversal = new TreeTraversal();
    }

    /**
     * Inserting a new node when the min heap is empty
     */
    @Test
    void testInsertForEmptyTree() {
        treeManipulation = new TreeManipulation(new MinHeapStrategy(new TreeNodeNull()));
        root = treeManipulation.insert(newNode);
        assertEquals(emptyTreeInsertionTestResult, treeTraversal.preOrderHeapTraversal(root));
    }

    /**
     * Inserting a new node to a non empty min heap
     */
    @Test
    void testInsert() {
        treeManipulation = new TreeManipulation(new MinHeapStrategy(root));
        root = treeManipulation.insert(newNode);
        assertEquals(preOrderAfterInsertionTestResult, treeTraversal.preOrderHeapTraversal(root));
    }

}
