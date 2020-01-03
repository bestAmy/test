package cn.whpu.practice01.one;

public abstract class GeometricObject {
    protected String color;

    public GeometricObject(String color) {
        this.color = color;
    }

    public abstract double findArea();
    public abstract double findPerimeter();
}