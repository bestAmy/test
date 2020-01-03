package cn.whpu.demo06.exercise.three;

public class SquareEquation
{   double a,b,c;
    double root1,root2;
    public void setA(double a)
    { this.a=a;
    }
    public void setB(double b)
    { this.b=b;
    }
    public void setC(double c)
    { this.c=c;
    }
    public double  getRootOne() throws NoRealRootException,NoSquareEquationException
    {   if(a!=0)
    {  double disk=b*b-4*a*c;
        if(disk>=0)
        { root1=(-b+Math.sqrt(disk))/(2*a);
        }
        else
        {  throw new NoRealRootException("没有实根");
        }
    }
    else
    {
        throw new NoRealRootException("不是二次方程");
    }
        return root1;
    }
    public double  getRootTwo() throws NoRealRootException,NoSquareEquationException
    {   if(a!=0)
    {  double disk=b*b-4*a*c;
        if(disk>=0)
        { root2=(-b-Math.sqrt(disk))/(2*a);
        }
        else
        {  throw new NoRealRootException("没有实根");
        }
    }
    else
    {
        throw new NoRealRootException("不是二次方程");
    }
        return root2;
    }
}
class NoRealRootException extends Exception
{  String message;
    NoRealRootException(String s)
    {   message=s;
    }
    public String getMessage()
    {   return message;
    }
}
class NoSquareEquationException extends Exception
{  String message;
    NoSquareEquationException(String s)
    {   message=s;
    }
    public String getMessage()
    {   return message;
    }
}

