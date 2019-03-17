package com.jensonjo.operation;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.jensonjo.domain.Student;
import lombok.extern.java.Log;

/**
 * Created by jensonkakkattil on Mar, 2019.
 */

@Log
public class Iteration {
    public static void main(String args[]) {

        String arr[] = new String[]{"a", "b", "c", "a"};
        Stream<String> stream;
        //stream = Arrays.stream(arr);
        stream = Stream.of(arr);

        //display each element
        stream.forEach(x -> log.info(x));

        try {
            //count distinct elements
            log.info("" + stream.distinct().count());
        } catch (Exception e) {
            log.warning(e.getLocalizedMessage());
        }

        Supplier<Stream<String>> stringStreamSupplier = () -> Stream.of(arr);
        log.info("#distinct chars : " + stringStreamSupplier.get().distinct().count());

        Consumer<Student> studentLogger = (s) -> log.info(s.getFName() + " " + s.getLName());

        List<Student> studentList = IntStream.rangeClosed(0, 9).mapToObj
                (x -> new Student().builder().fName(x + "Jenson").lName("Kakkattil").build())
                .collect(Collectors.toList());

        studentList.stream().forEach(studentLogger);
        //OR
        //studentList.stream().forEach((s) -> log.info(s.getFName() + " " + s.getLName()));

    }
}
