package cn.whpu.practice07.one;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

public class E {
    public static void main(String[] args) {
        File f=new File("file/E.java");
        try{
            RandomAccessFile in=new RandomAccessFile(f,"rw");
            System.out.println(f.length());
            FileOutputStream out=new FileOutputStream(f);
            System.out.println(f.length());
        } catch (FileNotFoundException e) {
            //System.out.println("File read Error"+e);
            e.printStackTrace();
        }
    }
}
