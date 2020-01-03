package cn.wupn.demo02;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        //p1.brand="苹果";
        //p1.color="black";
        //p1.price = 10000;
        p1.call("zqy");
        p1.sendMessage();

        Phone p2 = new Phone();
       // p2.brand="华为";
        //p2.color="black";
        //p2.price = 1000;
        p2.call("zqy");
        p2.sendMessage();
    }
}
