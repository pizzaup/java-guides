package com.lzg.java8.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @Author: lzg
 * @Date: 2020-12-09 19:34
 */
public class StreamWithFilterTest {

    @Test
    public void shouldFilterAllNumbersGreaterThan5ByUsingStreamAndFilter() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 5;
            }
        };

        List<Integer> collect = numbers.stream().filter(predicate).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }


    @Test
    public void shouldFilterAllNumbersGreaterThan5ByUsingStreamAndFilterWithLambda() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> collect = numbers.stream().filter(number -> number > 5).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }


    @Test
    public void shouldFilterAllNumbersGreaterThan5AndDividedBy2() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> collect = numbers
                .stream()
                .filter(number -> number > 5)
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }



}
