package com.fanglaojia.seth.guava;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Chars;
import org.junit.Test;

/**
 * @author ssx
 * @version 1.0.0
 * @fileName MultiSetTest.java
 * @description 新集合类测试
 * @date 2020-11-30 14:37
 * @since 1.0.0
 */
public class MultiSetTest {
    private static final String text = "白日何短短，百年苦易满。苍穹浩茫茫，万劫太极长。" +
            "麻姑垂两鬓，一半已成霜。天公见玉女，大笑亿千场。" +
            "吾欲揽六龙，回车挂扶桑。北斗酌美酒，劝龙各一觞。" +
            "富贵非所愿，与人驻颜光。";

    @Test
    public void handle() {
        //创建multiset
        Multiset<Character> characters = HashMultiset.create();
        //将text转为数组
        char[] chars = text.toCharArray();
        characters.addAll(Chars.asList(chars));
        System.out.println(characters);
        System.out.println(characters.size());
        System.out.println(characters.count('一'));
        System.out.println(characters.elementSet());
        characters.entrySet().forEach(e -> System.out.println(e.getElement()+":"+e.getCount()));
        System.out.println(characters.entrySet().iterator().next().getCount());
//        Iterator<Multiset.Entry<Character>> iterator = characters.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Multiset.Entry<Character> next = iterator.next();
//            System.out.println(next.getElement()+":"+next.getCount());
//        }
    }
}
