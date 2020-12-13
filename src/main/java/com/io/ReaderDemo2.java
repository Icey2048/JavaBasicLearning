package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
//��ӻ���
public class ReaderDemo2 {
	public static void main(String[] args) {
		Reader reader=null;
		try {
			reader=new FileReader("src.txt");//�ֽ�������ֱ�Ӷ����ĺ��֣��ַ���������
		int read=0;
		char[] chars=new char[1024];//�ַ�����
		while((read=reader.read(chars))!=-1) {
			System.out.println(chars);
			System.out.println(new String(chars,0,read));
		}		
		} catch (FileNotFoundException e) {
			System.out.println("icey-new FileReader(\"src.txt\")"+e);
		} catch (IOException e) {
			System.out.println("icey-reader.read()"+e);
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
