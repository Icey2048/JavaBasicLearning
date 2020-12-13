package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
//文件复制功能
public class IOTestDemo {
	//实现了赋值文件的功能
	public static void main(String[] args) {
		//根据本地的文件生成一个文件对象，这对象是一个文件对象，但是不是真实存在的，是一个在内存（jvm）里面的对象
		File src=new File("D://src1.txt");
		//File src=new File("./src/main/java/com/src.txt");
		
		File dest=new File("dest.txt");
		//创建输入输出流对象，用于内存和硬盘里面的管道对象
		//先初始话，再实例化--但我不想这么做
		try {
			InputStream inputstream =new FileInputStream(src);//需要提供一个他将去读的对象（这是一个输入流，他需要一个读的对象）
			OutputStream outputstream =new FileOutputStream(dest);//需要提供一个他将去读的对象（这是一个输入流，他需要一个读的对象）			
			//开始读和写入 //文件不知道有多长，所以需要一个缓冲器
			byte[] b=new byte[1024];
			int length=0;
			//鼠标点击看doc
			while((length=inputstream.read(b))!=-1) {//见下
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