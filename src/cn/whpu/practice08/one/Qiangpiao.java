package cn.whpu.practice08.one;

public class Qiangpiao {
    public static void main(String[] args) {
        WindowTicket windowTicket=new WindowTicket();

        Thread a=new Thread(windowTicket);
        a.setName("窗口1");
        a.start();

        Thread b=new Thread(windowTicket);
        b.setName("窗口2");
        b.start();

        Thread c=new Thread(windowTicket);
        c.setName("窗口3");
        c.start();

    }



}
