package com.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {
    public static void main(String[] args) {
        File file = new File("writer.txt");//这时候还没有这个文件
        Writer writer = null;
        try {
            writer = new FileWriter(file);//这时候就有了
            writer.write("www.mashibing.com");
            writer.write("马士兵教育");
            writer.flush();//水管中剩余的水，调用了fluse之后的数据强行刷新，就有数据了
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();//flush和close都可以把数据写进去
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
/**什么时候需要加flush,什么时候不加flush
*      最保险的方式，在输出流关闭之前每次都flush一下，然后再关闭
*      当某一个输出流对象中带有缓冲区的时候，就需要进行flush，不建议大家去记住每个输出流的分类
*/