package main.controller.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

/**
 * Constants class to store final values used at multiple places in the project.
 */
public class Constants {
    //isOdd predicate/condition is used to filter a set of values satisfying odd condition
    public static final Predicate<Integer> isOdd = (n) -> n % 2 == 1;
}
