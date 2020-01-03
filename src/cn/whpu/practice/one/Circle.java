package cn.whpu.practice.one;

public class Circle {
    private double radius;
    static int numOfObjects=0;

    public Circle() {
        this(1);
        numOfObjects++;
    }

    public Circle(double radius) {
        this.radius = radius;
        numOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }

    public static void printCircle(Circle c){
        System.out.println("圆的半径为："+c.getRadius());
        System.out.println("圆的面积为："+String.format("%.2f",c.area()));
    }
}
