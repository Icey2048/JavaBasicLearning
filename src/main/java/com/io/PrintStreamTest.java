package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author: ��ʿ������
 * @create: 2019-09-28 16:07
 */
public class PrintStreamTest {

    public static void main(String[] args) {
        PrintStream printStream = null;
        try {
        	//printStream = new PrintStream(new FileOutputStream("dest.txt"));
            printStream = new PrintStream(System.out);//�˴������ֽ�����������ˣ����Ǳ�׼�������̨
            printStream.write("hello mashibing".getBytes());//д��byte�е�����
            printStream.println(true);
            System.out.println();//�����һ�����в�����
            //��ʽ����� %s���ַ���  %d:����  %f:������
            System.out.printf("%s--%d---%.2f","abc",123,111.1111);//��ʽ��%.2f"�������λ
            System.err.println("mashibing");//�������ģ��ᱨ��
        } catch (IOException e) {
            e.printStackTrace();
        }
        printStream.close();
    }
}
