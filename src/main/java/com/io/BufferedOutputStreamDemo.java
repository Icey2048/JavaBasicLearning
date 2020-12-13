package com.io;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author: 马士兵教育
 * @create: 2019-09-22 21:34
 */
public class BufferedOutputStreamDemo {//带buffer的字节输出流
    public static void main(String[] args) {

        File file = new File("123.txt");
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream =null;
        try {
            fileOutputStream = new FileOutputStream(file);
            bufferedOutputStream = new BufferedOutputStream(System.out);
            bufferedOutputStream.write(98);//会被识别成AscII码值 
            bufferedOutputStream.write("www.baidu.com".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
