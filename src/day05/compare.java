package day05;
//定义一个方法判断比较两个数据是否一样
//参数类型分别是两个byte型，两个short类型，两个int类型，两个long类型
public class compare {
    public static void main(String[] args) {
        short a=1,b=4;
        byte c=3,d=3;
        System.out.println(samePare(a,b));
        System.out.println(samePare(c,d));
    }
    public static boolean samePare(byte a,byte b){
        boolean same = true;
        if(a==b){
            same=true;
        }else{
            same=false;
        }
        return same;
    }
    public static boolean samePare(short a,short b){
        boolean same = a==b?true:false;
        return same;
    }
}
