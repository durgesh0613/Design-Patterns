package test;

import main.model.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TreeNodeTest {

    TreeNode root;
    TreeNode leftNode;
    TreeNode rightNode;

    @BeforeEach
    void setUp() {
        root = new TreeNode(50);
        leftNode = new TreeNode(45);
        rightNode = new TreeNode(48);
    }

    @Test
    void testSetData(){
        root.setData(45);
        assertEquals(45, root.getData());
    }

    @Test
    void testSetLeft(){
        root.setLeft(leftNode);
        assertEquals(leftNode, root.getLeft());
    }

    @Test
    void testSetRight(){
        root.setRight(rightNode);
        assertEquals(rightNode, root.getRight());
    }
}
