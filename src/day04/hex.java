package day04;
import java.util.Scanner;
public class hex {
    public static void main (String[] args){
        //创建一个字符串将每一个十六进制数放入里面
        String hex ="";
        //余数大小
        int hexDigit=0;
        String h="";
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的十进制数：");
        int demical = input.nextInt();
        System.out.println("请输入你想转化的进制类型：");
        int n = input.nextInt();
        while(demical!=0) {
            hexDigit = demical % n;
            if(hexDigit<=9){
                hex = hexDigit + hex;
            }
            else{
                switch (hexDigit)
                {
                    case 10: h="A"; break;
                    case 11: h="B"; break;
                    case 12: h="C"; break;
                    case 13: h="D"; break;
                    case 14: h="E"; break;
                    case 15: h="F"; break;
                    default: System.out.println("wrong");
                }
                hex = h +hex;
            }
           demical = demical/n;
        }
        System.out.println("转化成"+n+"进制后为："+hex);
    }
}
