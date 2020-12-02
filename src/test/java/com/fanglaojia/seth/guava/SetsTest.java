package com.fanglaojia.seth.guava;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author ssx
 * @version 1.0.0
 * @fileName SetsTest.java
 * @description guava sets 测试
 * @date 2020-11-30 15:56
 * @since 1.0.0
 */
public class SetsTest {
    private static final Set<Integer> set1 = Sets.newHashSet(1,2);
    private static final Set<Integer> set2 = Sets.newHashSet(2,3,4,5);

    @Test
    public void union() {
        Sets.SetView<Integer> union = Sets.union(set1, set2);
        System.out.println(JSON.toJSONString(union));
    }

    @Test
    public void difference() {
        Sets.SetView<Integer> intersection = Sets.symmetricDifference(set1, set2);
        System.out.println(intersection);
    }

    @Test
    public void position() {
        Set<List<Integer>> lists = Sets.cartesianProduct(set1, set2);
        lists.forEach(System.out :: println);
    }

    @Test
    public void list() {
        ArrayList<Integer> integers = Lists.newArrayList(1, 2, 3, 4, 5, 6);
        List<Integer> partition = Lists.reverse(integers);
        partition.forEach(System.out::println);
    }

}
