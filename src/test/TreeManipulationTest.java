package test;

import main.controller.TreeManipulation;
import main.controller.TreeTraversal;
import main.model.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.TestConstants.emptyTreeInsertionTestResult;
import static test.TestConstants.preOrderAfterInsertionTestResult;

public class TreeManipulationTest {
    TreeNode root;
    TreeNode newNode;
    TreeTraversal treeTraversal;
    TreeManipulation treeManipulation;

    @BeforeEach
    void setUp(){
        root = TreeUtil.createDummyTree();
        newNode = new TreeNode(50);
        treeTraversal = new TreeTraversal();
        treeManipulation = new TreeManipulation();
    }

    @Test
    void testInsertForEmptyTree(){
        //If tree is empty
        root = treeManipulation.insert(null, newNode);
        assertEquals(emptyTreeInsertionTestResult, treeTraversal.preOrderHeapTraversal(root));
    }

    @Test
    void testInsert(){
        //If tree is non-empty
        root = treeManipulation.insert(root, newNode);
        assertEquals(preOrderAfterInsertionTestResult, treeTraversal.preOrderHeapTraversal(root));
    }

    @Test
    void testBeginInsertion(){
        root = treeManipulation.beginInsertion(root, newNode);
        assertEquals(preOrderAfterInsertionTestResult, treeTraversal.preOrderHeapTraversal(root));
    }

}
