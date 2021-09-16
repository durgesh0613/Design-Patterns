package test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestConstants {
    public static final ArrayList<Integer> preOrderTestResult = new ArrayList<Integer>
            (Arrays.asList(45, 65, 90, 99, 95, 81, 72, 82, 96));

    public static final ArrayList<Integer> postOrderTestResult = new ArrayList<Integer>
            (Arrays.asList(99, 95, 90, 81, 65, 82, 96, 72, 45));

    public static final Integer testHeight = 4;

    public static final ArrayList<Integer> preOrderWithOddValuesTestResult = new ArrayList<Integer>
            (Arrays.asList(45, 65, 99, 95, 81));

    public static final ArrayList<Integer> emptyTreeInsertionTestResult = new ArrayList<Integer>
            (Arrays.asList(50));

    public static final ArrayList<Integer> preOrderAfterInsertionTestResult = new ArrayList<Integer>
            (Arrays.asList(45, 65, 90, 99, 95, 81, 50, 72, 82, 96));
}
