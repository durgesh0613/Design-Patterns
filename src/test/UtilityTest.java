package test;

import main.controller.TreeTraversal;
import main.controller.utility.Utility;
import main.model.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static main.controller.utility.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.TestConstants.*;

public class UtilityTest {
    TreeNode root;

    @BeforeEach
    void setUp(){
        root = Utility.createDummyTree();
    }

    @Test
    void testFindHeight(){
        assertEquals(testHeight, Utility.findHeight(root));
    }

    @Test
    void testPrintTree(){
        //Test without filter condition
        assertEquals(preOrderTestResult.toString(),
                Utility.printTree(preOrderTestResult, null));

        //Test with filter condition
        assertEquals(preOrderWithOddValuesTestResult.toString(),
                Utility.printTree(preOrderTestResult, isOdd));
    }

    @Test
    void testFilter(){
        //Test with odd values filter on list
        assertEquals(preOrderWithOddValuesTestResult.toString(),
                Utility.printTree(preOrderTestResult, isOdd));
    }

    @Test
    void testCreateDummyTree(){
        assertEquals(preOrderTestResult, new TreeTraversal().preOrderHeapTraversal(root));
    }

}
