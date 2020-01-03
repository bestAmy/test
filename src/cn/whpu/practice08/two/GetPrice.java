package cn.whpu.practice08.two;

public class GetPrice {
    public static void main(String[] args) {
        Price price=new Price();

        Thread a=new Thread(price);
        a.setName("抽奖箱1");
        a.start();

        Thread b=new Thread(price);
        b.setName("抽奖箱2");
        b.start();

    }
}
