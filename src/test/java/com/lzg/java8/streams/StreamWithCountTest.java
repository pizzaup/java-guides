package com.lzg.java8.streams;


import lombok.Data;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

/**
 * @Author: lzg
 * @Date: 2020-12-09 19:23
 */
public class StreamWithCountTest {


    @Test
    public void shouldCountNumbersInTheList() throws Exception {

        List<Integer> listOfNumbers  = Arrays.asList(1, 2, 3, 4, 5);

        long count = listOfNumbers.stream().count();

        System.out.println(count);

    }








}
