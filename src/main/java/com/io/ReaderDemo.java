package com.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {
	public static void main(String[] args) {
		try {
			Reader reader=new FileReader("src.txt");//字节流可以直接读中文汉字，字符流会乱码
		/** int read=reader.read();//只读一个byte就结束了？yes
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
/**FileReader 如果换为FileInputStream(),就读一个字节，就会乱码
一个中文汉字占用几个字节--linux: man utf8 :不一定*/