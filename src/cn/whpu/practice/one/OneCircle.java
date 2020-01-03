package cn.whpu.practice.one;

public class OneCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0);
        Circle c2 = new Circle();

        System.out.println("c1的面积为："+String.format("%.2f",c1.area()));
        System.out.println("c2的面积为："+String.format("%.2f",c2.area()));
        System.out.print("c1的");
        c1.printCircle(c1);
        System.out.print("c2的");
        c2.printCircle(c2);
        System.out.println("一共创建了 "+ Circle.numOfObjects+"个对象");
    }
}
