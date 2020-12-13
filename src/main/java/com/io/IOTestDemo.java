package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
//�ļ����ƹ���
public class IOTestDemo {
	//ʵ���˸�ֵ�ļ��Ĺ���
	public static void main(String[] args) {
		//���ݱ��ص��ļ�����һ���ļ������������һ���ļ����󣬵��ǲ�����ʵ���ڵģ���һ�����ڴ棨jvm������Ķ���
		File src=new File("D://src1.txt");
		//File src=new File("./src/main/java/com/src.txt");
		
		File dest=new File("dest.txt");
		//����������������������ڴ��Ӳ������Ĺܵ�����
		//�ȳ�ʼ������ʵ����--���Ҳ�����ô��
		try {
			InputStream inputstream =new FileInputStream(src);//��Ҫ�ṩһ������ȥ���Ķ�������һ��������������Ҫһ�����Ķ���
			OutputStream outputstream =new FileOutputStream(dest);//��Ҫ�ṩһ������ȥ���Ķ�������һ��������������Ҫһ�����Ķ���			
			//��ʼ����д�� //�ļ���֪���ж೤��������Ҫһ��������
			byte[] b=new byte[1024];
			int length=0;
			//�������doc
			while((length=inputstream.read(b))!=-1) {//����
				outputstream.write(b);//Writes b.length bytes from the byte array to this output stream
			}			
		} catch (FileNotFoundException e) {
			System.out.println("error of new FileInputStream(src):"+e);
		} catch (IOException e) {
			System.out.println("inputstream.read(buffer)"+e);
		}
		
	}
}
/**inputstream.read(b)
 * Reads some number of bytes from the input stream 
 * and stores them intothe buffer array b. 
 * The number of bytes actually read isreturned as an integer. 
 * This method blocks until input data isavailable, end of file is detected, 
 * or an exception is thrown. 
 */