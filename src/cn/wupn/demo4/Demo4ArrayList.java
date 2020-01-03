package cn.wupn.demo4;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.jar.JarOutputStream;

public class Demo4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList arr = new ArrayList();
        arr.add("hello");
        arr.add(2);
        arr.add(true);
        System.out.println(arr.get(1));
        System.out.println(arr);
        System.out.println(arr.remove(1));
        System.out.println(arr);
        System.out.println(arr.size());
    }
}
