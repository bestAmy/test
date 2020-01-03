package cn.wupn.demo4;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zqy");
        list.add("hyy");
        list.add("wmz");
        list.add("lss");
        printArrarlist(list);
    }
    public static void printArrarlist(ArrayList<String> ls){
        System.out.print("{");
        for (int i = 0; i < ls.size(); i++) {
            if(i==ls.size()-1){
                System.out.print(ls.get(i));
                System.out.print("}");
            }else{
                System.out.print(ls.get(i));
                System.out.print("@");
            }
        }
    }
}
