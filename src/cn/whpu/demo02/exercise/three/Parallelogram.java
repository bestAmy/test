package cn.whpu.demo02.exercise.three;


class Quadrangle {
    public void print(){
        System.out.println("Quadrangle");
    }
    public static void draw(Quadrangle q) {
        System.out.println("Quadrangle");
    }
}

class Square extends Quadrangle {
    public void print(){
        System.out.println("Square");
    }
    public void aType(){
        System.out.println("type is Square");
    }
}

class Anything {
    public void printA(){
        System.out.println("Anything");
    }
}

public class Parallelogram extends Quadrangle {
    public void print(){
        System.out.println("Parallelogram");
    }
    public void PType(){
        System.out.println("The type is Parallelogram");
    }
    public static void main(String args[]) {
        Quadrangle q = new Parallelogram(); // 实例化父类对象
        // 判断父类对象是否为Parallelogram子类的一个实例
        draw(q);
        if (q instanceof Parallelogram) {
            Parallelogram p = (Parallelogram) q; // 向下转型操作
            p.PType();
//            draw(p);
        }
        // 判断父类对象是否为Parallelogram子类的一个实例
        if (q instanceof Square) {
            Square s = (Square) q; // 进行向下转型操作
            System.out.println("hhhh");
            s.aType();
            draw(s);
        }
        // 由于q对象不为Anything类的对象，所以这条语句是错误的
        // System.out.println(q instanceof Anything);
    }
}
