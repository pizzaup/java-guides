package com.lzg.java8.functions.functionalinterface;

/**
 * @Author: lzg
 * @Date: 2020-12-09 18:58
 */

@FunctionalInterface
public interface FakeFunctionalInterface {

   abstract void doSomething();

//    abstract String doAnotherSomething();   If you remove the comment, the compiler will complain.

}
