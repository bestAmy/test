package cn.wupn.demo1;

import com.sun.security.jgss.GSSUtil;

public class reverse {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        int temp;
        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
}
