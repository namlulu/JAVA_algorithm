package org.example.java8;

import java.util.ArrayList;
import java.util.List;

public class Foo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("123");
        names.add("456");
        names.add("789");
        names.add("101112");

        List<String> names2 = names.stream()
                .map(String::toUpperCase)
                .collect(java.util.stream.Collectors.toList());
        names2.forEach(System.out::println);
    }
}
