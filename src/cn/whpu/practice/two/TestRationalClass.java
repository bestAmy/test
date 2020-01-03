package cn.whpu.practice.two;

public class TestRationalClass {
    public static void main(String[] args) {
        Rational r1 = new Rational(2,1);
        Rational r2 = new Rational(2,3);
        System.out.println(r1.toString()+" + "+r2.toString()+" = "+r1.add(r2).toString());
        System.out.println(r1.toString()+" - "+r2.toString()+" = "+r1.subtract(r2).toString());
        System.out.println(r1.toString()+" * "+r2.toString()+" = "+r1.multiply(r2).toString());
        System.out.println(r1.toString()+" / "+r2.toString()+" = "+r1.divide(r2).toString());

    }
}
