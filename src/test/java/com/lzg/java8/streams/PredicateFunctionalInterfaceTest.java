package com.lzg.java8.streams;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

/**
 * @Author: lzg
 * @Date: 2020-12-09 20:16
 */
public class PredicateFunctionalInterfaceTest {

    @Test
    public void shouldCheckThatTheTextIsGreaterThan5UsingAnonymousClass() throws Exception {
        Predicate<String> greaterThan5 = new Predicate<String>() {
            @Override
            public boolean test(String text) {
                return text.length() > 5;
            }
        };

        boolean isGreaterThan5 = greaterThan5.test("Java 8 - Guide");

        System.out.println(isGreaterThan5);
    }


    @Test
    public void shouldCheckThatTheTextIsGreaterThan5UsingLambdaExpression() throws Exception {
        Predicate<String> predicate = text -> text.length()>5;
        System.out.println(predicate.test("123123"));
    }

    @Test
    public void shouldCheckThatTheTextIsGreaterThan5AndNegateIt() throws Exception {
        Predicate<String> greaterThan5 = text -> text.length() > 5;
        boolean test = greaterThan5.negate().test("Java 8 - Guide");
        System.out.println(test);
    }

    @Test
    public void shouldCheckThatTheTextIsGreaterThan5AndLessThan10UsingAnonymousClass() throws Exception {

        Predicate<String> greaterThan5 = new Predicate<String>() {

            @Override
            public boolean test(String text) {
                return text.length() > 5;
            }
        };

        Predicate<String> lessThan10 = new Predicate<String>() {

            @Override
            public boolean test(String text) {
                return text.length() < 10;
            }
        };

        System.out.println(greaterThan5.and(lessThan10).test("12312312"));
    }



    @Test
    public void shouldCheckThatTheTextIsGreaterThan5AndLessThan10UsingLambdaExpression() throws Exception {
        Predicate<String> greaterThan5 = text -> text.length() > 5;

        Predicate<String> lessThan10 = text -> text.length() < 10;

        System.out.println(greaterThan5.and(lessThan10).test("Java 8"));

    }






}
