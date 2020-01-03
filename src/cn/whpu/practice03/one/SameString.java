package cn.whpu.practice03.one;

import java.util.Scanner;

public class SameString {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
        System.out.println("请输入要查找的字符串：");
        Scanner input = new Scanner(System.in);
        String s2=input.next();
        int count=0,index=0;
        while (s1.indexOf(s2,index)>=0)
        {
            count++;
            index=s1.indexOf(s2,index)+s2.length();
        }
        System.out.println(s2+"在"+s1+"中出现的次数为："+count);
        //int indexOne = s1.indexOf(s2);
    }
}
