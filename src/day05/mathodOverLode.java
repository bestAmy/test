package day05;
//方法的重载:多个方法名称一样，但参数列表不同，只需要记住一个函数名就可以实现多个方法
/*
注意事项，与下列的因素有关：
1、参数个数不同
2、参数类型不同
3、参数的多类型顺序不同

方法的重载与下列因素无关
1、与参数名称无关
2、与方法的返回值类型无关
 */
public class mathodOverLode {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1,2,3));
        System.out.println(add(1.0,1.3));
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a, int b,int c){
        return a+b+c;
    }
    public  static int add(double a,double b){
        return (int)(a+b);
    }
}
