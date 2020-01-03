package exercise_two;

import java.sql.SQLOutput;

public class MaxOverload {
    public static void main(String[] args) {
        System.out.println("max(1,3)="+max(1,3));
        System.out.println("max(2.4,5.6)="+max(2.4,5.6));
        System.out.println("max(8,7,6)="+max(8,7,6));
    }
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static double max(double a,double b){
        return a>b?a:b;
    }
    public static int max(int a,int b,int c){
        if(a>b&&a>c){
            return a;
        }
        else if(b>a&&b>c){
            return b;
        }
        else {
            return c;
        }
    }
}
