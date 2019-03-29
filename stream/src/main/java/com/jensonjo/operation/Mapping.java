package com.jensonjo.operation;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by jensonkakkattil on Mar, 2019.
 */
public class Mapping {
    public static void main(String args[]) {
        List<String> uris = new ArrayList<>();
        uris.add("/Users/jensonkakkattil/myrepositories/itsjenson/java8samples/README.md");

        //mapping only
        Stream<Path> pathStream = uris.stream().map(uri -> Paths.get(uri));
    }
}
