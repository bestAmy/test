package exercise.outer;

public class Outer {
    public void method(){
        class inner{
            public void innerMethod(){
                System.out.println("局部类方法");
            }
        }
        inner in=new inner();
        in.innerMethod();
    }
    public void outMethod(){
        System.out.println("这是外部类方法");
        method();
    }
}
