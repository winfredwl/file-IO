package com.winfred.study;

import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Winfred.Wang
 * @since 2017/3/14
 */
public class FileReader {

    public static void main(String[] args) {
        try {
            ClassPathResource classPathResource = new ClassPathResource("file" + File.separator + "testfile.txt");
            InputStreamReader inputStreamReader = new InputStreamReader(classPathResource.getInputStream());
            BufferedReader br = new BufferedReader(inputStreamReader);
            String content;
            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
