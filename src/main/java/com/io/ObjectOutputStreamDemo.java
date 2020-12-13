package com.io;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author: ��ʿ������
 * @create: 2019-09-22 21:47
 */
public class ObjectOutputStreamDemo {//��д�����ٶ�����/
    public static void main(String[] args) {

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("abc.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeUTF("www.mashibing.com");//��Ҫ��uft
            objectOutputStream.writeObject(new Person(1,"zhangsan","123456"));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                objectOutputStream.close();
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
