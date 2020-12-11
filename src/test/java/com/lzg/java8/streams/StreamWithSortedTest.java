package com.lzg.java8.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: lzg
 * @Date: 2020-12-09 19:53
 */
public class StreamWithSortedTest {

    @Test
    public void shouldSortTheList() throws Exception {
        List<String> listOfWords = Arrays.asList("B", "A", "D", "E", "C");

        listOfWords.stream().sorted().forEach(System.out::println);

    }


    @Test
    public void shouldSortTheListWithInvertedComparator() throws Exception {

        List<String> listOfWords = Arrays.asList("B", "A", "D", "E", "C");

        Comparator<String> comparator =(str1, str2) -> str2.compareTo(str1);

        listOfWords.stream().sorted(comparator).forEach(System.out::print);

    }




}
