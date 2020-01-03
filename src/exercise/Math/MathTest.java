package exercise.Math;

public class MathTest {
    public static void main(String[] args) {
        int a=(int)Math.ceil(-10.8);
        int b=(int)Math.floor(5.9);
        int count=0;
        for(int i=a;i<=b;i++){
            if(Math.abs(i)>6||Math.abs(i)<2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("绝对值大于6或者小于2的整数有："+count+"个");
    }
}
