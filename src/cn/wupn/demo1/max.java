package cn.wupn.demo1;

public class max {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,5};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
