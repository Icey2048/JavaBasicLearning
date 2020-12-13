package com.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: ��ʿ������
 * @create: 2019-09-28 15:28
 */
public class BufferedWriterTest {

    public static void main(String[] args) {

        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try {
            fileWriter =  new FileWriter(new File("dest.txt"));//��newһ���ַ���
            bufferedWriter = new BufferedWriter(fileWriter);//����
            bufferedWriter.append("mashibing");//׷��
            bufferedWriter.newLine();//����
            bufferedWriter.append("��ʿ������");
            bufferedWriter.flush();//ˢ��
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();//�ر�
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
