package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author: 马士兵教育
 * @create: 2019-09-28 16:07
 */
public class PrintStreamTest {

    public static void main(String[] args) {
        PrintStream printStream = null;
        try {
        	//printStream = new PrintStream(new FileOutputStream("dest.txt"));
            printStream = new PrintStream(System.out);//此处不是字节流输出对象了，而是标准输出控制台
            printStream.write("hello mashibing".getBytes());//写出byte中的内容
            printStream.println(true);
            System.out.println();//会输出一个空行并换行
            //格式化输出 %s：字符串  %d:整数  %f:浮点数
            System.out.printf("%s--%d---%.2f","abc",123,111.1111);//格式化%.2f"会输出两位
            System.err.println("mashibing");//输出错误的，会报红
        } catch (IOException e) {
            e.printStackTrace();
        }
        printStream.close();
    }
}
