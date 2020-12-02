package com.fanglaojia.seth.guava;

import com.google.common.base.Charsets;
import com.google.common.io.CharSink;
import com.google.common.io.CharSource;
import com.google.common.io.Files;
import com.google.common.io.Resources;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author ssx
 * @version 1.0.0
 * @fileName IOTest.java
 * @description io测试
 * @date 2020-11-30 16:35
 * @since 1.0.0
 */
public class IOTest {
    @Test
    public void copy() throws IOException {
//        charsource charSource = Files.asCharSource(new File("sourceText.txt"), Charsets.UTF_8);
        CharSource charSource = Resources.asCharSource(new URL("http://www.ibloger.net/article/3312.html"),
                Charsets.UTF_8);
        CharSink charSink = Files.asCharSink(new File("targetText.txt"), Charsets.UTF_8);
        charSource.copyTo(charSink);
    }
}
