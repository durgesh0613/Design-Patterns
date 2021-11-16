package test;

import main.controller.TreeTraversal;
import main.model.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static test.TestConstantsMinHeap.postOrderTestResult;
import static test.TestConstantsMinHeap.preOrderTestResult;

/**
 * Test class for TreeTraversal : MIN HEAP
 */
public class TreeTraversalMinHeapTest {

    private TreeNode root;
    private TreeTraversal treeTraversal;

    @BeforeEach
    void setUp() {
        root = TestUtility.createDummyMinHeap();
        treeTraversal = new TreeTraversal();
    }

    @Test
    void testPostOrderHeapTraversal() {
        assertEquals(postOrderTestResult, treeTraversal.postOrderHeapTraversal(root));
    }

    @Test
    void testPreOrderHeapTraversal() {
        assertEquals(preOrderTestResult, treeTraversal.preOrderHeapTraversal(root));
    }

    @Test
    void testClearResult() {
        treeTraversal.preOrderHeapTraversal(root);      //Adding values to resultTree list
        treeTraversal.clearResult();
        assertTrue(treeTraversal.getResultTree().isEmpty());
    }
}