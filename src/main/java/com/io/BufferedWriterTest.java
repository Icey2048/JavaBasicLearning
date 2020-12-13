package com.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author: 马士兵教育
 * @create: 2019-09-28 15:28
 */
public class BufferedWriterTest {

    public static void main(String[] args) {

        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try {
            fileWriter =  new FileWriter(new File("dest.txt"));//先new一个字符流
            bufferedWriter = new BufferedWriter(fileWriter);//构建
            bufferedWriter.append("mashibing");//追加
            bufferedWriter.newLine();//换行
            bufferedWriter.append("马士兵教育");
            bufferedWriter.flush();//刷新
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();//关闭
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
