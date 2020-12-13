package com.io;

/**
 * @author: ��ʿ������
 * @create: 2019-09-22 16:14
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * ��java����Ҫ��д�ļ��е����ݵĻ�����Ҫʹ�����ĸ���
 *  ����ʾ��һ���ļ������ݷ��͵���һ���ļ�������һ�����������
 *      ������Ҫѡ��һ���������ǰ������Ϊ������
 *          ��һ���ļ��ж�ȡ���ݵ��������������
 *          �ӳ���������ݵ���һ���ļ����������
 *
 * ע�⣺����дio���ĳ����ʱ��һ��Ҫע��ر���
 *      ����;
 *          1��ѡ����ʵ�io������
 *          2����������
 *          3����������
 *          4���ر�������ռ��ϵͳ��Դ��--����һ���ļ�ϵͳ����һ������ֻ�ܷ���1024���ļ������������£�����߳̾ͻ������ܿ�
 */
public class StreamDemo {
    public static void main(String[] args) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("abc.txt");
            int length = 0;
            //��ӻ������ķ�ʽ���ж�ȡ��ÿ�λὫ������ӵ��������У�������������֮��һ�� ��ȡ��������ÿһ���ֽڽ��ж�ȡ
            byte[] buffer = new  byte[1024];
            while((length = inputStream.read(buffer,5,5))!=-1){
                System.out.println(new String(buffer,5,length));
            }
//            int read = inputStream.read();
//            System.out.println((char)read);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
