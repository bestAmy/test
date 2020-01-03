package operation.one;

import java.util.Scanner;

public class s {
    public static int Search(int[] somearry,int size,int value){
        for (int i = 0; i < size; i++) {
            if(somearry[i]==value){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int size=6;
        int[] arr={3,5,6,8,-1,6};
        int value;
        System.out.println("请输入一个整数：");
        Scanner input=new Scanner(System.in);
        value=input.nextInt();
        int a=Search(arr,size,value);
        System.out.println("得到的结果为："+a);
    }

}
