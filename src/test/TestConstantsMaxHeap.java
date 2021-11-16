package test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class used to store constants/final values for test-cases with respect to dummy MAX HEAP input.
 */
public class TestConstantsMaxHeap {
    public static final ArrayList<Integer> preOrderTestResult = new ArrayList<Integer>
            (Arrays.asList(90, 89, 36, 21, 18, 75, 15, 70, 63, 65));

    public static final ArrayList<Integer> postOrderTestResult = new ArrayList<Integer>
            (Arrays.asList(21, 18, 36, 15, 75, 89, 63, 65, 70, 90));

    public static final Integer testHeight = 4;

    public static final ArrayList<Integer> preOrderWithOddValuesTestResult = new ArrayList<Integer>
            (Arrays.asList(89, 21, 75, 15, 63, 65));

    public static final ArrayList<Integer> emptyTreeInsertionTestResult = new ArrayList<Integer>
            (Arrays.asList(50));

    public static final ArrayList<Integer> preOrderAfterInsertionTestResult = new ArrayList<Integer>
            (Arrays.asList(90, 89, 36, 21, 18, 75, 15, 70, 63, 50, 65));

    public static final String emptyMessage = "No elements in the tree";
}
