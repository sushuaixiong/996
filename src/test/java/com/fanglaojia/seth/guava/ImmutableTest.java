package com.fanglaojia.seth.guava;

import com.google.common.collect.ImmutableSet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ssx
 * @version 1.0.0
 * @fileName ImmutableTest.java
 * @description guava不可变集合测试
 * @date 2020-11-30 13:36
 * @since 1.0.0
 */
public class ImmutableTest {
    public static void remove(List<Integer> list) {
        list.remove(0);
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(1);
        integers.add(2);
        ImmutableSet<Integer> immutableSet = ImmutableSet.copyOf(integers);
        ImmutableSet<Integer> build = ImmutableSet.<Integer>builder().addAll(integers)
                .add(3).build();
        build.forEach(System.out:: println);
    }
}
