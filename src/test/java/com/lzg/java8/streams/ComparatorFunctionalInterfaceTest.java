package com.lzg.java8.streams;

import org.junit.Test;

import java.util.Comparator;

/**
 * @Author: lzg
 * @Date: 2020-12-09 20:31
 */
public class ComparatorFunctionalInterfaceTest {


    @Test
    public void shouldCompareTwoGuidesByUsingComparator() throws Exception {
        CraftCoderGuide mockito = new CraftCoderGuide("Mockito");
        CraftCoderGuide java = new CraftCoderGuide("Java 8");


        Comparator<CraftCoderGuide> comparator = new Comparator<CraftCoderGuide>() {

            @Override
            public int compare(CraftCoderGuide first, CraftCoderGuide second) {
                return first.getName().compareTo(second.getName());
            }
        };

        System.out.println(comparator.compare(mockito, java));
    }


    @Test
    public void shouldCompareTwoGuidesByUsingComparatorWithLambdaExpression() throws Exception {
        CraftCoderGuide mockito = new CraftCoderGuide("Mockito");
        CraftCoderGuide java = new CraftCoderGuide("Java 8");

        Comparator<CraftCoderGuide> comparator = (first, second) -> first.getName().compareTo(second.getName());

        System.out.println(comparator.compare(mockito, java));

    }


    @Test
    public void shouldCompareAndReverseTwoGuidesByUsingComparator() throws Exception {
        CraftCoderGuide mockito = new CraftCoderGuide("Mockito");
        CraftCoderGuide java = new CraftCoderGuide("Java 8");

        Comparator<CraftCoderGuide> comparator = (first, second) -> first.getName().compareTo(second.getName());

        int compared = comparator.reversed().compare(mockito, java);

        System.out.println(compared);
    }






}

class CraftCoderGuide {

    private String name;

    public CraftCoderGuide(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}