package com.io;

import java.io.*;

/**
 * @author: 马士兵教育
 * @create: 2019-09-22 21:27
 */
//带缓冲的字节流--在普通的字节流上面加一个处理流，这个BufferedInputStream就是处理流，
//FileInputStream属于节点流
public class BufferedInputStreamDemo {
    public static void main(String[] args) {

        File file = new File("src.txt");
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
             fileInputStream = new FileInputStream(file);
             bufferedInputStream = new BufferedInputStream(fileInputStream);//对节点流进行封装
            int read = 0;
            while((read = bufferedInputStream.read())!=-1){
                bufferedInputStream.skip(10);//可以跳过bytes数
                System.out.print((char)read);//可以按字符格式化
            };
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
