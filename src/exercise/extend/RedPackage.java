package exercise.extend;

public class RedPackage {
    public static void main(String[] args) {
        Qunzhu a1=new Qunzhu(300.45);
        Chengyuan b1=new Chengyuan(24.3);
        Chengyuan b2=new Chengyuan(34.5);
        double m=a1.sendRedPackage(20.3,2);
        a1.getShengyuMoney();
        a1.getQunzhuMoney();
        b1.getMoney(m);
        b1.getChengyuanMoney();
        b2.getMoney(m);
        b2.getChengyuanMoney();
    }

}

 class Yue{
    private double shengyuMoney;

     public Yue(double shengyuMoney) {
         this.shengyuMoney=shengyuMoney;
     }

     public double getShengyuMoney() {
        return shengyuMoney;
    }

    public void setShengyuMoney(double shengyuMoney) {
        this.shengyuMoney = shengyuMoney;
    }
}
class Qunzhu extends Yue{
    Qunzhu(double shengyuMoney){
        super(shengyuMoney);
    }
    public double sendRedPackage(double money,int n){
        super.setShengyuMoney(super.getShengyuMoney()-money);
        return money/n;
    }
    public void getQunzhuMoney(){
        System.out.println("群主的余额为："+super.getShengyuMoney());
    }
}
class Chengyuan extends Yue{
    Chengyuan(double shengyuMoney){
        super(shengyuMoney);
    }
    public double getMoney(double money){
        super.setShengyuMoney(super.getShengyuMoney()+money);
        return super.getShengyuMoney();
    }
    public void getChengyuanMoney(){
        System.out.println("成员A的余额为："+super.getShengyuMoney());
    }
}
