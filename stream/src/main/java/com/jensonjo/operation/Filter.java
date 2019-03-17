package com.jensonjo.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.extern.java.Log;

/**
 * Created by jensonkakkattil on Mar, 2019.
 */
@Log
public class Filter {

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

        List<String> dList = list
                .stream()
                .distinct()
                .filter(
                        element -> element.toLowerCase().contains("i".toLowerCase()))
                .collect(Collectors.toList());
        log.info("List of names that contain char 'i'");
        dList.stream().forEach(element -> log.info(element));
    }
}
