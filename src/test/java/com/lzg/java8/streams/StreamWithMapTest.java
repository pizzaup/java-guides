package com.lzg.java8.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author: lzg
 * @Date: 2020-12-09 19:44
 */
public class StreamWithMapTest {

    @Test
    public void shouldMultiplyEachElementBy2() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 2;
            }
        };

        List<Integer> collect = numbers.stream().map(function).collect(Collectors.toList());

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        collect.forEach(consumer);
    }


    @Test
    public void shouldMultiplyEachElementBy2UsingLambdaExpression() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Integer> function = number -> number*2;

        List<Integer> collect = numbers.stream().map(function).collect(Collectors.toList());

        Consumer<Integer> consumer = number -> System.out.println(number);

        collect.forEach(consumer);

    }


    @Test
    public void shouldMultiplyAndTransformIntoStringEachElement() throws Exception {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.stream()
                .map(number -> number*2)
                .map(number -> String.valueOf(number))
                .forEach(System.out::println);
    }

}
