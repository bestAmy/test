package cn.wupn.demo02;

import java.util.ArrayList;

public class ArrayListPhone {
    public static void main(String[] args) {
        Phone p1 = new Phone("苹果",10000,"白色");
        Phone p2 = new Phone("华为",5000,"蓝色");
        Phone p3 = new Phone("oppo",2000,"粉色");
        Phone p4 = new Phone("vivo",3000,"白色");

        ArrayList<Phone> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("品牌："+list.get(i).getBrand()+"  价格："+list.get(i).getPrice()+"  颜色："+list.get(i).getColor());
        }
    }


}
