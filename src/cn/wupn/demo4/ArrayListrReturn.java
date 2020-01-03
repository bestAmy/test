package cn.wupn.demo4;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListrReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(100));
        }
        System.out.println(list);
        System.out.println(chooseEnvn(list));

    }
    public static ArrayList<Integer> chooseEnvn(ArrayList<Integer> li){
        ArrayList<Integer> smList = new ArrayList<>();
        for (int i = 0; i < li.size(); i++) {
            if(li.get(i)%2==0){
                smList.add(li.get(i));
            }
        }
        //System.out.println(li.size());
        //System.out.println(smList);
        return smList;
    }
}
