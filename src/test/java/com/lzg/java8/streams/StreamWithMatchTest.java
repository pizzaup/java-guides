package com.lzg.java8.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: lzg
 * @Date: 2020-12-09 19:58
 */
public class StreamWithMatchTest {


    @Test
    public void shouldCheckIfThereIsANumberGreaterThan4() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean b = numbers.stream().anyMatch(number -> number > 4);
        System.out.println(b);
    }


    @Test
    public void shouldCheckIfEachNumberIsPair() throws Exception {
        List<Integer> numbers = Arrays.asList(2, 4, 6);
        boolean b = numbers.stream().allMatch(number -> number % 2 == 0);
        System.out.println(b);
    }

    @Test
    public void shouldCheckIfEachNumberIsNotPair() throws Exception {
        List<Integer> numbers = Arrays.asList(3, 5, 7);
        boolean b = numbers.stream().noneMatch(number -> number % 2 == 0);
        System.out.println(b);
    }



}
