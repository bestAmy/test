package cn.whpu.demo01.exercise.one;

class Trangle
{
    double sideA,sideB,sideC,area,length;
    boolean boo;
    public  Trangle(double a,double b,double c)
    {
        sideA=a;
        sideB=b;
        sideC=c;
        if(a+b>c&&a+c>b&&b+c>a) //a,b,c构成三角形的条件表达式
        {
            boo=true;
        }
    else
        {
            boo=false;
        }
    }
    double getLength()
    {
       return sideA+sideB+sideC; //方法体，要求计算出length的值并返回
    }
    public double  getArea()
    {
        if(boo)
        {
            double p=(sideA+sideB+sideC)/2.0;
            area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)) ;
            return area;
        }
        else
        {
            System.out.println("不是一个三角形,不能计算面积");
            return 0;
        }
    }
    public void setABC(double a,double b,double c)
    {
        sideA=a;
        sideB=b;
        sideC=c;//参数a,b,c分别赋值给sideA,sideB,sideC
        if(a+b>c&&a+c>b&&b+c>a) //a,b,c构成三角形的条件表达式
        {
            boo=true;//给boo赋值。
        }
    else
        {
            boo=false;//给boo赋值。
        }
    }
}
class Lader
{
    double above,bottom,height,area;
    Lader(double a,double b,double h)
    {
        above=a;
        bottom=b;
        height=h;//方法体，将参数a,b,c分别赋值给above,bottom,height
    }
    double getArea()
    {
        return (above+bottom)*height/2;//方法体，,要求计算出area返回
    }
}

class Circle
{
    double radius,area;
    Circle(double r)
    {
        radius=r; //方法体
    }
    double getArea()
    {
       return Math.PI*radius*radius; //方法体，要求计算出area返回
    }
    double getLength()
    {
      return 2*Math.PI*radius; //getArea方法体的代码,要求计算出length返回
    }
    void setRadius(double newRadius)
    {
        radius=newRadius;
    }
    double getRadius()
    {
        return radius;
    }
}
public class AreaAndLength
{
    public static void main(String args[])
    {
        double length,area;
        Circle circle;
        Trangle trangle;
        Lader lader;
        circle = new Circle(2.0); //创建对象circle
        trangle = new Trangle(4,5,3); //创建对象trangle。
        lader = new Lader(2,4,5); //创建对象lader
        length = circle.getLength(); // circle调用方法返回周长并赋值给length
        System.out.println("圆的周长:"+String.format("%.2f",length));
        area = circle.getArea(); // circle调用方法返回面积并赋值给area
        System.out.println("圆的面积:"+String.format("%.2f",area));
        length = trangle.getLength(); // trangle调用方法返回周长并赋值给length
        System.out.println("三角形的周长:"+length);
        area = trangle.getArea(); // trangle调用方法返回面积并赋值给area
        System.out.println("三角形的面积:"+area);
        area = lader.getArea(); // lader调用方法返回面积并赋值给area
        System.out.println("梯形的面积:"+area);
        trangle.setABC(12,34,1); // trangle调用方法设置三个边，要求将三个边修改为12,34,1。
        area = trangle.getArea(); // trangle调用方法返回面积并赋值给area
        System.out.println("三角形的面积:"+area);
       trangle.getLength(); // trangle调用方法返回周长并赋值给length
        System.out.println("三角形的周长:"+length);
    }
}

