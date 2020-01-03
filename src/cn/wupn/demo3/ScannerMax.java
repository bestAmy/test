package cn.wupn.demo3;

import java.util.Scanner;

public class ScannerMax {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arr.toString());
        int max = arr[0];
        for(int j=0;j<3;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        System.out.println("最大值为："+max);
    }

}
