package com.io;

import java.io.*;

/**
 * @author: ��ʿ������
 * @create: 2019-09-22 21:27
 */
//��������ֽ���--����ͨ���ֽ��������һ�������������BufferedInputStream���Ǵ�������
//FileInputStream���ڽڵ���
public class BufferedInputStreamDemo {
    public static void main(String[] args) {

        File file = new File("src.txt");
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
             fileInputStream = new FileInputStream(file);
             bufferedInputStream = new BufferedInputStream(fileInputStream);//�Խڵ������з�װ
            int read = 0;
            while((read = bufferedInputStream.read())!=-1){
                bufferedInputStream.skip(10);//��������bytes��
                System.out.print((char)read);//���԰��ַ���ʽ��
            };
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedInputStream.close();
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
