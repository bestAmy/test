package exercise.Interface;

public interface MyInterfaceAbstract {
    //都是抽象方法
    public abstract void methodAbs1();
    public abstract void methodAbs2();
    public void methodAbs3();
    void methodAbs4();
    public default void methodDefault(){
        System.out.println("接口的默认方法");
        methodCommon();
    }
    public static void methodStatic(){
        System.out.println("这是接口的静态方法");
        methodStaticComment();
    }
    private void methodCommon(){
        System.out.println("AAA");
    }
    private static void methodStaticComment(){
        System.out.println("BBB");
    }
}
