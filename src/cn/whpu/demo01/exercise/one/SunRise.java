package cn.whpu.demo01.exercise.one;

import cn.whpu.demo01.exercise.three.SquareEquation;

class SunRise
{
    public static void main(String args[ ])
    {
        SquareEquation equation=new SquareEquation(4,5,1);
        equation.getRoots();
        equation.setCoefficient(-3,4,5);
        equation.getRoots();
    }
}
