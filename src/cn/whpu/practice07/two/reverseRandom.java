package cn.whpu.practice07.two;

import java.io.IOException;
import java.io.RandomAccessFile;

public class reverseRandom {
    public static void main(String[] args) {
        RandomAccessFile inAndOut=null;
        char data[]={'a','b','c','d'};
        System.out.println("文件为：");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("\t%c",data[i]);
        }
        System.out.println();
        try{ inAndOut=new RandomAccessFile("file/c.txt","rw");
            for(int i=0;i<data.length;i++) {
                inAndOut.writeChar(data[i]);
            }
            System.out.println("倒叙输出：");
            for(long i=data.length-1;i>=0;i--) { //一个char型数据占1个字节，inAndOut从
                inAndOut.seek(i*2);          //文件的第36个字节读取最后面的一个整数，
                System.out.printf("\t%c",inAndOut.readChar()); //每隔4个字节往前读取一个整数
            }
            inAndOut.close();
        }
        catch(IOException e){}
    }
}
