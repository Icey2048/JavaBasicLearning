package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
//添加缓冲
public class ReaderDemo2 {
	public static void main(String[] args) {
		Reader reader=null;
		try {
			reader=new FileReader("src.txt");//字节流可以直接读中文汉字，字符流会乱码
		int read=0;
		char[] chars=new char[1024];//字符数组
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
