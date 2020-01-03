package cn.wupn.demo3;

import java.util.Scanner;

public class Scance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("输入的数字为："+num);
        String str = sc.next();
        System.out.println("输入的字符串为："+str);
    }
}
