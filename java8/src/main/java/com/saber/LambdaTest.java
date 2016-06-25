package com.saber;

import java.util.function.BiFunction;

/**
 * Created by saberseddik on 2016-02-21.
 */
public class LambdaTest {

    private final String value;

    public LambdaTest(String value) {
        this.value = value;
    }

    public void process(BiFunction<String, Integer, String> function) {

        System.out.println(function.apply(this.value, 5));
    }
}
