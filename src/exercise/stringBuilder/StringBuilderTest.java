package exercise.stringBuilder;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringB1=new StringBuilder("abc");
        stringB1.append("123");
        System.out.println("stringB1:"+stringB1);
        StringBuilder stringB2=new StringBuilder("abc");
        System.out.println("stringB2:"+stringB2);
        String s1 = stringB2.toString();
        System.out.println(s1);

        int i=9;
        //Integer i1=new Integer(i);
        //Integer i2=new Integer("4");
        Integer i1=Integer.valueOf(i);
        Integer i2=Integer.valueOf("45");
        System.out.println(i2);
        i2=i1.intValue();
        System.out.println(i2);


    }
}
