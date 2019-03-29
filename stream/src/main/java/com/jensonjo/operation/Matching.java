package com.jensonjo.operation;

import java.util.ArrayList;

import lombok.extern.java.Log;

/**
 * Created by jensonkakkattil on Mar, 2019.
 */
@Log
public class Matching {
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
                element -> log.info(element)
        );

        log.info("contains(h) : " + list.stream().anyMatch(
                element -> element.contains("h")
        ));

        log.info("noneMatch(x) : " + list.stream().noneMatch(
                element -> element.contains("x")));
    }
}
