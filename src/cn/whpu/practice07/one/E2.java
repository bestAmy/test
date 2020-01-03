package cn.whpu.practice07.one;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E2 {
    public static void main(String[] args) {
        int n=-1;
        File f=new File("file/hello.txt");
        byte [] a= "abcd".getBytes();
        try{
            FileOutputStream out=new FileOutputStream(f);
            out.write(a);
            out.close();
            FileInputStream in=new FileInputStream(f);
            byte[] tom=new byte[3];
            int m= in.read(tom,0,3);
            System.out.println(m);
            String s= new String(tom,0,3);
            System.out.println(s);
            m=in.read(tom,0,3);
            System.out.println(m);
            s=new String(tom,0,3);
            System.out.println(s);
        }
        catch (IOException e){

        }
    }
}
