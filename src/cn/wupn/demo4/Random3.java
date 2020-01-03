package cn.wupn.demo4;

import java.util.Random;
import java.util.Scanner;

public class Random3 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        Random r = new Random();
        for(int i=1;i<20;i++){
            System.out.println(r.nextInt(n)+1);
        }
    }
}
