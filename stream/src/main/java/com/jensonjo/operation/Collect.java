package com.jensonjo.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/**
 * Created by jensonkakkattil on Mar, 2019.
 */
@Log
public class Collect {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");

        list.stream().forEach(
                System.out::println
        );

        List<String> resultList = list
                .stream()
                .map(
                        element -> element.toUpperCase())
                .collect(Collectors.toList());

        log.info("Converted to upper case");
        resultList.stream().forEach(
                System.out::println
        );

    }
}
