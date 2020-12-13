package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {
	public static void main(String[] args) {
		try {
			Reader reader=new FileReader("src.txt");//�ֽ�������ֱ�Ӷ����ĺ��֣��ַ���������
		/** int read=reader.read();//ֻ��һ��byte�ͽ����ˣ�yes
			System.out.println(read+":"+(char)read);*/
		int read =0;
		while((read=reader.read())!=-1) {
			System.out.print((char)read+"6");
		}		
		} catch (FileNotFoundException e) {
			System.out.println("icey-new FileReader(\"src.txt\")"+e);
		} catch (IOException e) {
			System.out.println("icey-reader.read()"+e);
		}
		
	}
}
/**Reads a single character.  This method will block until a character is
* available, an I/O error occurs, or the end of the stream is reached* */
/**FileReader �����ΪFileInputStream(),�Ͷ�һ���ֽڣ��ͻ�����
һ�����ĺ���ռ�ü����ֽ�--linux: man utf8 :��һ��*/