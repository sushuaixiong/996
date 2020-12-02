package com.fanglaojia.seth.guava;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author ssx
 * @version 1.0.0
 * @fileName OptionalTest.java
 * @description optional测试
 * @date 2020-11-30 10:10
 * @since 1.0.0
 */
public class OptionalTest {
    @Test
    public void createTest() {
        Optional.of("123");
        Optional<Object> o = Optional.ofNullable(null);
        o.orElseGet(() -> 0);
        o.ifPresent(System.out :: println);
    }

    public static void stream(List list) {
        Optional.ofNullable(list)
                .map(List :: stream)
                .orElseGet(Stream :: empty)
                .forEach(System.out :: println);
    }

    public static void main(String[] args) {
        stream(null);
    }
}
