package com.lzg.java8.functions;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;

/**
 * @Author: lzg
 * @Date: 2020-12-09 18:55
 */
public class FunctionFunctionalInterfaceTest {

    @Test
    public void shouldConvertANumberAsStringToIntegerUsingFunctionsWithAnonymousClass() throws Exception {

        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        };

        Integer apply = function.apply("123");
        System.out.println(apply);
    }



    @Test
    public void shouldConvertANumberAsStringToIntegerUsingFunctionsWithLambdaExpression() throws Exception {
        Function<String,Integer> function = stringAsNumber -> Integer.valueOf(stringAsNumber);
        Integer apply = function.apply("855456");
        System.out.println(apply);

    }





    @Test
    public void shouldConvertANumberAsStringToIntegerAndMultiplyItUsingAnonymousClass() throws Exception {
        Function<String, Integer> convertToInteger = new Function<String, Integer>() {

            @Override
            public Integer apply(String numberAsString) {
                return Integer.valueOf(numberAsString);
            }
        };

        Function<Integer, Integer> multiplyBy10 = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer number) {
                return number * 10;
            }
        };

        Integer number = convertToInteger.andThen(multiplyBy10).apply("10");

        System.out.println(number);
    }



    @Test
    public void shouldConvertANumberAsStringToIntegerAndMultiplyItByUsingLambdaExpression() throws Exception {

        Function<String,Integer> convertToInteger  = stringAsNumber -> Integer.valueOf(stringAsNumber);

        Function<Integer,Integer> multipyBy10  = number -> number*10;

        Integer apply = convertToInteger.andThen(multipyBy10).apply("45");

        System.out.println(apply);

    }



}
