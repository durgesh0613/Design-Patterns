package test;

import main.controller.utility.Utility;
import main.model.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static main.controller.utility.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static test.TestConstants.*;

public class UtilityTest {
    TreeNode root;

    @BeforeEach
    void setUp(){
        root = TestUtility.createDummyTree();
    }

    @Test
    void testFindHeight(){
        assertEquals(testHeight, Utility.findHeight(root));
    }

    @Test
    void testPrintTreeForEmptyTree(){
        //If resultTree is null
        assertEquals(emptyMessage, Utility.printTree(null, null));

        //If resultTree is empty
        assertEquals(emptyMessage, Utility.printTree(new ArrayList<Integer>(), null));
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
}
