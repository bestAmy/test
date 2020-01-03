package exercise.NiName;

public class Test {
    public static void main(String[] args) {
        Myinterface myinterface = new Myinterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类调用aaa");
            }
        };
        myinterface.method();
        new Myinterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类调用bbb");
            }
        }.method();

    }
}
