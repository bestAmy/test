package cn.whpu.practice08.one;

import cn.whpu.practice05.three.WindowOperation;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WindowTicket implements Runnable {
    static int count=20;
    static Lock lock = new ReentrantLock();
    public void run() {
            synchronized (WindowTicket.class) {
                while (count>0){
                //lock.lock();
                count--;
                System.out.println(Thread.currentThread().getName() + "抢到第" + (20 - count) + "张票，剩余" + count);
                // lock.unlock();
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
