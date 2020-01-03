package cn.whpu.practice08.two;

import java.util.Random;

public class Price implements Runnable {
    public void run(){
        int [] arr={10,5,20,50,100,200,500,800,2,80,300};
        for (int i = 0; i <5; i++) {
            Random r=new Random();
            System.out.println(Thread.currentThread().getName()+"又产生了一个"+arr[r.nextInt(11)]+"元大奖");
        }
    }
}
