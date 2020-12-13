package com.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) {
        File file = new File("writer.txt");//��ʱ��û������ļ�
        Writer writer = null;
        try {
            writer = new FileWriter(file);//��ʱ�������
            writer.write("www.mashibing.com");
            writer.write("��ʿ������");
            writer.flush();//ˮ����ʣ���ˮ��������fluse֮�������ǿ��ˢ�£�����������
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();//flush��close�����԰�����д��ȥ
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
/**ʲôʱ����Ҫ��flush,ʲôʱ�򲻼�flush
*      ��յķ�ʽ����������ر�֮ǰÿ�ζ�flushһ�£�Ȼ���ٹر�
*      ��ĳһ������������д��л�������ʱ�򣬾���Ҫ����flush����������ȥ��סÿ��������ķ���
*/