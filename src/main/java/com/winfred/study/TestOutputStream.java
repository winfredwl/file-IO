package com.winfred.study;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Winfred.Wang
 * @since 2017/3/15
 */
public class TestOutputStream {

    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("D:\\testfile.txt");
            for (int i = 0; i < 10; i++) {
                outputStream.write(65+i);
            }
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
