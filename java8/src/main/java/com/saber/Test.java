package com.saber;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.IntStream.Builder;

public class Test {

    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Saber");
        listOfStrings.add("Mayssa");
        listOfStrings.add("Eya");
        listOfStrings.add("Monia");

        listOfStrings.stream().forEach(string -> {
                    String newString = string.substring(3);
                    System.out.println(newString);
                }
        );


        new LambdaTest("this is a big String").process((param, param2) -> param.substring(param2));
        IntStream.iterate(0, i -> i + 2).forEach(integer -> System.out.println(integer));
    }


}