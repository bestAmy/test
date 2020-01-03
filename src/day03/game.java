package day03;

import java.util.Scanner;

public class game {
    public static void main(String[] args){
        //定义已经完成的题目个数
        int count = 0;
        //表示总共的题目个数
        int numberCount = 5;
        //表示答对题目的个数
        int rightCount = 0;
        //表示题目字符串
        String Timu = "";
        //表示开始的时间
        long startTime = System.currentTimeMillis();

        while(count<numberCount){
            int number1 = (int)(Math.random()*10);
            int number2 = (int)(Math.random()*10);
            System.out.println("第"+(count+1)+"个题为：");
            System.out.println(number1+"+"+number2+"的值为多少？");
            Scanner input = new Scanner(System.in);
            System.out.print("请输入你的结果：");
            int x = input.nextInt();
            if(x==(number1+number2)){
                System.out.println("you are right!");
                rightCount++;
            }
            else{
                System.out.println("you are wrong!");
                System.out.println("正确的结果为："+(number1+number2));
            }
            Timu =Timu+ " "+number1+"+"+number2+"的值为多少？";
            count++;
        }
        long endTime =System.currentTimeMillis();
        System.out.println("答题时间为："+(endTime-startTime)/1000+"s");
        System.out.println("答对个数为："+rightCount+"个");
        System.out.println("题目为："+Timu);
    }
}
