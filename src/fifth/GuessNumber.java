package fifth;

import javax.swing.JOptionPane;

public class GuessNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("给你一个1至100之间的整数,请猜测这个数");
        int realNumber=(int)(Math.random()*100)+1;
        int yourGuess=0;
        String str=JOptionPane.showInputDialog("输入您的猜测:");
        yourGuess=Integer.parseInt(str);
        while(yourGuess!=realNumber) //循环条件
        {
            if(yourGuess>realNumber) //条件代码
            {
                str=JOptionPane.showInputDialog("猜大了,再输入你的猜测:");
                yourGuess=Integer.parseInt(str);
            }
            else if(yourGuess<realNumber) //条件代码
            {
                str=JOptionPane.showInputDialog("猜小了,再输入你的猜测:");
                yourGuess=Integer.parseInt(str);
            }
        }
        System.out.println("猜对了!");
    }

}
