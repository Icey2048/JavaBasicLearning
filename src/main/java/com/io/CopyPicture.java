package com.io;

import java.io.*;

/**
 * @author: 马士兵教育
 * @create: 2019-09-22 20:29
 */
public class CopyPicture {
    public static void main(String[] args) {

    	/***字符流示范 ---只能处理纯文本
        FileReader reader = null;//读取流对象
        FileWriter writer = null;

        try {
            reader = new FileReader("1.jpg");
            writer = new FileWriter("2.jpg");

            int length = 0;
            char[] chars = new char[1024];
            while((length = reader.read(chars))!=-1){
                writer.write(chars);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
//上述的FileReader和FileWriter都换成他们的父类fileInputStream，fileOutputStream
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("manda.jpg");
            fileOutputStream = new FileOutputStream("copyed.jpg");

            int length = 0;
            byte[] buffer = new byte[1024];
            while((length = fileInputStream.read(buffer))!=-1){
                fileOutputStream.write(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
