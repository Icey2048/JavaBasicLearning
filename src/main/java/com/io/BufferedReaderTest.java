package com.io;

import java.io.*;

/**
 * @author: 马士兵教育
 * @create: 2019-09-28 15:21
 */
public class BufferedReaderTest {
    public static void main(String[] args) {

        BufferedReader  reader = null;//这个类是及一个加强版的字符流，可以提高读的效率，带了缓冲区

        try {
            reader = new BufferedReader(new FileReader("src.txt"));
            String read = null;
            while((read = reader.readLine())!=null){//按行读
                System.out.println(read);
            };
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();//要记得关
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
