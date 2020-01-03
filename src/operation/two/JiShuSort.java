package operation.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class JiShuSort {
    public static void main(String[] args) {
        int[] a1={12,34,54,32,45,56,34};
        System.out.print("排序前：");
        printArr(a1);
        //System.out.println();
        GeWeiSort(a1);
        System.out.print("排序后：");
        printArr(a1);
    }

    public static void  printArr(int[] a){
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static int[] GeWeiSort(int[] a){
        ArrayList<Integer> a1 = new ArrayList<>(),a2=new ArrayList<>(),a3=new ArrayList<>(),a4=new ArrayList<>(),a5=new ArrayList<>(),a6=new ArrayList<>(),a7=new ArrayList<>(),a8=new ArrayList<>(),a9=new ArrayList<>(),a10=new ArrayList<>();
        for (int i = 0; i <a.length ; i++) {
            switch (a[i]%10) {
                case 0:
                    a1.add(a[i]);break;
                case 1:
                    a2.add(a[i]);break;
                case 2:
                    a3.add(a[i]);break;
                case 3:
                    a4.add(a[i]);break;
                case 4:
                    a5.add(a[i]);break;
                case 5:
                    a6.add(a[i]);break;
                case 6:
                    a7.add(a[i]);break;
                case 7:
                    a8.add(a[i]);break;
                case 8:
                    a9.add(a[i]);break;
                case 9:
                    a10.add(a[i]);break;
            }
        }
        for(int i=0;i<a1.size();i++)
            a[i]=a1.get(i);
        for (int i = 0; i <a2.size() ; i++) {
            a[i+a1.size()]=a2.get(i);
        }
        for (int i = 0; i <a3.size() ; i++) {
            a[i+a1.size()+a2.size()]=a3.get(i);
        }
        for (int i = 0; i <a4.size() ; i++) {
            a[i+a1.size()+a2.size()+a3.size()]=a4.get(i);
        }
        for (int i = 0; i <a5.size() ; i++) {
            a[i+a1.size()+a2.size()+a3.size()+a4.size()]=a5.get(i);
        }
        for (int i = 0; i <a6.size() ; i++) {
            a[i+a1.size()+a2.size()+a3.size()+a4.size()+a5.size()]=a6.get(i);
        }
        for (int i = 0; i <a7.size() ; i++) {
            a[i+a1.size()+a2.size()+a3.size()+a4.size()+a5.size()+a6.size()]=a7.get(i);
        }
        for (int i = 0; i <a8.size() ; i++) {
            a[i+a1.size()+a2.size()+a3.size()+a4.size()+a5.size()+a6.size()+a7.size()]=a8.get(i);
        }
        for (int i = 0; i <a9.size() ; i++) {
            a[i+a1.size()+a2.size()+a3.size()+a4.size()+a5.size()+a6.size()+a7.size()+a8.size()]=a9.get(i);
        }
        for (int i = 0; i <a10.size() ; i++) {
            a[i+a1.size()+a2.size()+a3.size()+a4.size()+a5.size()+a6.size()+a7.size()+a8.size()+a9.size()]=a10.get(i);
        }
        System.out.print("个位排序后：");
        printArr(a);

        a1.clear();a2.clear();a3.clear();a4.clear();a5.clear();a6.clear();a7.clear();a8.clear();a9.clear();a10.clear();
        for (int i = 0; i <a.length ; i++) {
            switch (a[i]/10) {
                case 0:
                    a1.add(a[i]);break;
                case 1:
                    a2.add(a[i]);break;
                case 2:
                    a3.add(a[i]);break;
                case 3:
                    a4.add(a[i]);break;
                case 4:
                    a5.add(a[i]);break;
                case 5:
                    a6.add(a[i]);break;
                case 6:
                    a7.add(a[i]);break;
                case 7:
                    a8.add(a[i]);break;
                case 8:
                    a9.add(a[i]);break;
                case 9:
                    a10.add(a[i]);break;
            }
        }
        for(int i=0;i<a1.size();i++)
            a[i]=a1.get(i);
        for (int i = 0; i <a2.size() ; i++) {
            a[i+a1.size()]=a2.get(i);
        }
        for (int i = 0; i <a3.size() ; i++) {
            a[i+a1.size()+a2.size()]=a3.get(i);
        }
        for (int i = 0; i <a4.size() ; i++) {
            a[i+a1.size()+a2.size()+a3.size()]=a4.get(i);
        }
        for (int i = 0; i <a5.size() ; i++) {
            a[i+a1.size()+a2.size()+a3.size()+a4.size()]=a5.get(i);
        }
        for (int i = 0; i <a6.size() ; i++) {
            a[i+a1.size()+a2.size()+a3.size()+a4.size()+a5.size()]=a6.get(i);
        }
        for (int i = 0; i <a7.size() ; i++) {
            a[i+a1.size()+a2.size()+a3.size()+a4.size()+a5.size()+a6.size()]=a7.get(i);
        }
        for (int i = 0; i <a8.size() ; i++) {
            a[i+a1.size()+a2.size()+a3.size()+a4.size()+a5.size()+a6.size()+a7.size()]=a8.get(i);
        }
        for (int i = 0; i <a9.size() ; i++) {
            a[i+a1.size()+a2.size()+a3.size()+a4.size()+a5.size()+a6.size()+a7.size()+a8.size()]=a9.get(i);
        }
        for (int i = 0; i <a10.size() ; i++) {
            a[i+a1.size()+a2.size()+a3.size()+a4.size()+a5.size()+a6.size()+a7.size()+a8.size()+a9.size()]=a10.get(i);
        }
        System.out.print("十位排序后：");
        printArr(a);
        return a;

    }
}
