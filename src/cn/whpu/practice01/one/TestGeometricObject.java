package cn.whpu.practice01.one;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject g1 = new Circle("red",3);
        GeometricObject g2 = new Rectangle("red",3,5);
        System.out.println("两个对象的面积相等吗？"+equalArea(g1,g2));
        System.out.println("圆形的信息为：");
        displayGeometricObject(g1);
        System.out.println("长方形的信息为：");
        displayGeometricObject(g2);

    }
    public static boolean equalArea(GeometricObject object1, GeometricObject   object2){
        return object1.findArea()==object2.findArea();
    }

    public static void displayGeometricObject(GeometricObject object){
        System.out.println();
        System.out.println("The area is "+object.findArea());
        System.out.println("The perimeter is "+object.findPerimeter());
    }
}
