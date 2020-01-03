package cn.whpu.practice01.one;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI*radius*radius;
    }
    public double findPerimeter(){
        return 2*Math.PI*radius;
    }
}
