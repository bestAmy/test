package cn.whpu.practice07.two;

import java.io.*;

public class readAndWirte {
    public static void main(String[] args) {
        File sourceFile=new File("file/write.txt");
        File targeFile=new File("file/read.txt");
        char c[]=new char[40];
        try{
            Writer out=new FileWriter(targeFile,true);

            Reader in=new FileReader(sourceFile);
            int n=-1;
            in.read(c);
            for (int i = 0; i < c.length; i++) {
                if(c[i]=='\n'){
                    System.out.println("换行");
                    c[i-1]=',';c[i]=',';
                    //out.write(",",i+1,1);
                }
            }
            out.write(c);

            out.flush();
            out.close();
        }
        catch (IOException e){}

    }
}
