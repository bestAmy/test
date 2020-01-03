package day01;

import org.w3c.dom.ls.LSOutput;

import java.net.SocketOption;
import java.util.Scanner;

//使用三元运算符和if-else语句分别取两个数字的最大值
public class max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int max;
        max = a > b ? a : b;
        System.out.println("较大值为： " + max);

        if (a > b)
            System.out.println(a);
        else
            System.out.println(b);

    }

}

