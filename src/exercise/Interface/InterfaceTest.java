package exercise.Interface;

public class InterfaceTest {
    public static void main(String[] args) {
        MyInterfaceAbsImpl impl = new MyInterfaceAbsImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();
        impl.methodDefault();
        MyInterfaceAbstract.methodStatic();
    }
}

