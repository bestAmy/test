package test_sizeyunsuan;
import siceyunsuan.yunsuan;
class  TestImpl {
//    @Override
//    public String toString() {
//        return "890";
//    }
    /**
     *
     */
}
public class test {
    public static void main(String[] args) {
        yunsuan yq = new yunsuan();
        yq.setA(3);
        yq.setB(6);
        int addResult = yq.add(yq.getA(),yq.getB());
        int minusResult = yq.minus(yq.getA(),yq.getB());
        int timesResult = yq.times(yq.getA(),yq.getB());
        int dividedResult = yq.divided(yq.getA(),yq.getB());
        System.out.println("add result is "+addResult);
        System.out.println("minus result is "+minusResult);
        System.out.println("times result is "+timesResult);
        System.out.println("divided result is "+dividedResult);
//        int[] result = new int[]{0,0};
        System.out.println("===================");
        System.out.println(new TestImpl());
    }
}
