package com.winfred.study;

import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Winfred.Wang
 * @since 2017/3/14
 */
public class TestInputStream {

    public static void main(String[] args) {
        try {
            // 读取相对路径方法1
            ClassPathResource classPathResource = new ClassPathResource("file" + File.separator + "testfile.txt");
            InputStream inputStream = classPathResource.getInputStream();
            // 读取相对路径方法2
//            InputStream inputStream = ClassLoader.getSystemResourceAsStream("file" + File.separator + "testfile.txt");
            int content;
            while ((content = inputStream.read()) != -1) {
                System.out.println(content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
