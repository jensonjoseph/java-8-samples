package com.jensonjo.scratch;

import java.util.HashSet;
import java.util.Set;

import lombok.extern.java.Log;

/**
 * Created by jensonkakkattil on Mar, 2019.
 */
@Log
public class TestSetIntersection {
    public static void main(String args[]) {
        Set<String> completedOperations = new HashSet<>();
        completedOperations.add("10");
        completedOperations.add("20");
        completedOperations.add("30");

        Set<String> futureOperations = new HashSet<>();
        futureOperations.add("20");
        futureOperations.add("30");
        futureOperations.add("40");
        futureOperations.add("50");
        futureOperations.add("60");
        futureOperations.add("70");
        futureOperations.add("70");

        Set<String> intersection = new HashSet<>(futureOperations);
        intersection.retainAll(completedOperations);
        int actualPercent = (intersection.size()* 100) / futureOperations.size() ;
        log.info(actualPercent + "% complete");
    }
}
