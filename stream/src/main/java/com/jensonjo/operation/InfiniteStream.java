package com.jensonjo.operation;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by jensonkakkattil on Mar, 2019.
 */
public class InfiniteStream {
    public static void main(String args[]) {
        Stream<Integer> infiniteStream = Stream.iterate(0, i -> i + 2);
        List<Integer> collect = infiniteStream.limit(10).collect(Collectors.toList());

        collect.stream().forEach(System.out::println);


        Supplier<UUID> randonUUIDSupplier = UUID::randomUUID;

        Stream<UUID> infiniteStreamOfRandomUUID = Stream.generate(randonUUIDSupplier);

        List<UUID> randonInts = infiniteStreamOfRandomUUID
                .skip(10)
                .limit(10)
                .collect(Collectors.toList());

        randonInts.stream().forEach(System.out::println);
    }
}
