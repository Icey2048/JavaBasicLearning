package com.io;

import java.io.*;

/**
 * @author: ��ʿ������
 * @create: 2019-09-28 15:21
 */
public class BufferedReaderTest {
    public static void main(String[] args) {

        BufferedReader  reader = null;//������Ǽ�һ����ǿ����ַ�����������߶���Ч�ʣ����˻�����

        try {
            reader = new BufferedReader(new FileReader("src.txt"));
            String read = null;
            while((read = reader.readLine())!=null){//���ж�
                System.out.println(read);
            };
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();//Ҫ�ǵù�
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
