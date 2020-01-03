package operation.one;

public class MinFind {
    public static void main(String[] args) {
        int[] a={1,3,5,6,8,9,22,45,67,77};
        System.out.println("有序数列为：");
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("要查找的目标值为："+45);
        midFind(a,45,0,a.length-1);

    }
    public static void midFind(int[] a1,int s,int start,int end){
        //int score=a1[(end-start)/2];
        if(a1[(end-start)/2+start]==s){
            System.out.println("找到目标值为："+(a1[(end-start)/2+start]));
        }else if(a1[(end-start)/2+start]<s){
            System.out.println("中间值"+(a1[(end-start)/2+start])+"小于目标值");
            midFind(a1,s,(end-start)/2+start+1,end);
        }else{
            System.out.println("中间值"+(a1[(end-start)/2+start])+"大于目标值");
            midFind(a1,s,start,(end-start)/2-1);
        }

    }
}
