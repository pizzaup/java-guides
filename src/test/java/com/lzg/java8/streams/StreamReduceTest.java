package com.lzg.java8.streams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

/**
 * @Author: lzg
 * @Date: 2020-12-09 20:04
 */
public class StreamReduceTest {

    @Test
    public void shouldReduceTheListOfNumbers() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 5);

        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        Optional<Integer> optional = numbers.stream().reduce(binaryOperator);

        if(optional.isPresent()){
            System.out.println(optional.get());
        }
    }



    @Test
    public void shouldReduceTheListOfNumbersByUsingLambdaExpression() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 5);

        Optional<Integer> optional = numbers.stream().reduce((first, secound) -> first + secound);

        if(optional.isPresent()){
            System.out.println(optional.get());
        }
    }


}
