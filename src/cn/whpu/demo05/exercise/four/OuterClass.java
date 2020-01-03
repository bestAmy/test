package cn.whpu.demo05.exercise.four;

public class OuterClass {
    innerClass in = new innerClass(); // 在外部类实例化内部类对象引用

    public void ouf() {
        in.inf(); // 在外部类方法中调用内部类方法
        System.out.println("在外部成员方法中调用了内部类方法");
        System.out.println("==========");
    }

    class innerClass {
        innerClass() { // 内部类构造方法
        }

        public void inf() {
            System.out.println("我是内部类成员方法");// 内部类成员方法
        }

        private int y = 0; // 定义内部类成员变量
    }

    public innerClass doit() { // 外部类方法，返回值为内部类引用
        // y=4; //外部类不可以直接访问内部类成员变量
        in.y = 4;
        return new innerClass(); // 返回内部类引用
    }

    public static void main(String args[]) {
        OuterClass out = new OuterClass();
        // 内部类的对象实例化操作必须在外部类或外部类中的非静态方法中实现
        out.ouf();
        OuterClass.innerClass in = out.doit();
        System.out.println("in的成员变量为："+in.y);
        in.inf();
        OuterClass.innerClass in2 = out.new innerClass();
        System.out.println("in2的成员变量为："+in2.y);
        in2.inf();
    }

}
