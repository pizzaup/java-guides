package com.lzg.java8.functions.functionalinterface;

import org.junit.jupiter.api.Test;

/**
 * @Author: lzg
 * @Date: 2020-12-09 19:00
 */
public class FunctionalInterfaceTest {


    @Test
    public void shouldUseRealFunctionalInterface() throws Exception {

        RealFunctionalInterface realFunctionalInterface = new RealFunctionalInterface() {

            @Override
            public void doSomething() {

                System.out.println("Doing Something");
            }
        };
    }



    @Test
    public void shouldUseRealFunctionalInterfaceWithJava8LambdaExpression() throws Exception {
        RealFunctionalInterface do_something = () -> System.out.println("do something");
        do_something.doSomething();
    }


}
