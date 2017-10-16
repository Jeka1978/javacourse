


package com.nice;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person implements Serializable {
    private String name;


    private transient int age;


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.forEach(System.out::println);
        List<Object> list1 = new ArrayList<>();
    }

}













