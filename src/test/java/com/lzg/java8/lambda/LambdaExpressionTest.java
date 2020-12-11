package com.lzg.java8.lambda;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * lambda
 *
 * 描述：
 *  lambda表达式是JAVA8中提供的一种新的特性，它支持JAVA也能进行简单的“函数式编程”。
 *
 *  Lambda表达式本身就是一个接口的实现,匿名内部类
 *
 *
 * 语法
 *
 *      1.可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
 *      2.可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。
 *      3.可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
 *      4.可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值。
 *
 *
 *      (parameters) -> expression
 *      或
 *      (parameters) ->{ statements; }
 *
 *      () -> expression
 *      (Type parameters) -> {return statements;}
 *      (Type parameters) -> statements;
 *      (parameters)      -> statements;
 *      parameters        -> statements;
 *
 *
 *
 */
class LambdaExpressionTest {

    @Test
    void contextLoads() {
        System.out.println("test");
    }


    @Test
    public void shouldRunUsingAnonymousClass() throws Exception {


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Yes, anonymous object here");
            }
        };

        runnable.run();
    }


    @Test
    public void shouldRunRunnableObjectWithoutAnonymousClass() throws Exception {
        Runnable runnable = () -> System.out.println("Awesome! Lambda Expression here!");
        runnable.run();
    }




    @Test
    public void shouldOrderTheListOfNamesByUsingAnonymousClass() throws Exception {
        List<String> craftCoderGuides = Arrays.asList("Mockito", "CDI", "JUnit", "Hibernate", "Spring");

        Collections.sort(craftCoderGuides, new Comparator<String>() {
            @Override
            public int compare(String firstGuide, String secondGuide) {
                return firstGuide.compareTo(secondGuide);
            }
        });

        craftCoderGuides.forEach(System.out::println);
    }


    @Test
    public void shouldOrderTheListOfNamesByLambdaExpression() throws Exception {
        List<String> craftCoderGuides = Arrays.asList("Mockito", "CDI", "JUnit", "Hibernate", "Spring");


        Collections.sort(craftCoderGuides, (String firstGuide, String secondGuide) -> {
            return firstGuide.compareTo(secondGuide);
        });

        craftCoderGuides.forEach(System.out::println);
    }


    @Test
    public void shouldOrderTheListOfNamesByLambdaExpressionWithoutBracesAndReturnKeyword() throws Exception {
        List<String> craftCoderGuides = Arrays.asList("Mockito", "CDI", "JUnit", "Hibernate", "Spring");

        Collections.sort(craftCoderGuides, (String firstGuide, String secondGuide) -> firstGuide.compareTo(secondGuide));

        craftCoderGuides.forEach(System.out::println);
    }




    @Test
    public void shouldOrderTheListOfNamesByLambdaExpressionWithoutParameterTypes() throws Exception {
        List<String> craftCoderGuides = Arrays.asList("Mockito", "CDI", "JUnit", "Hibernate", "Spring");

        Collections.sort(craftCoderGuides,(firstGuide, secondGuide)->firstGuide.compareTo(secondGuide));

        craftCoderGuides.forEach(System.out::println);

    }

}
