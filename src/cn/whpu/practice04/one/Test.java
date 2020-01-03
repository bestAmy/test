package cn.whpu.practice04.one;

import java.util.Scanner;

class MyException extends Exception{
    private int m;
    public MyException(int m){
        this.m=m;
    }
    public int getM(){
        return this.m;
    }
}

class Student{
    public void speak(int m) throws MyException{
        if(m<=1000){
            System.out.println("m是正常的");
        }
        else{
            throw new MyException(m);
        }

    }
}


public class Test {
    public static void main(String[] args) {
        Student student=new Student();
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入m的值：");
            student.speak(input.nextInt());
        } catch (MyException e) {
            System.out.println("m的值不可以大于1000，你输入的值为："+e.getM());
            //e.printStackTrace();
        }
    }



}