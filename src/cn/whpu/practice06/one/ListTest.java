package cn.whpu.practice06.one;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("马六");
        names.add("赵七");
        for(int i=0;i<names.size();i++){
            System.out.println("位置："+(i+1)+",元素："+names.get(i));
        }
        System.out.println("集合的大小为："+names.size());
        System.out.println("删除的元素为："+names.remove(2));
        System.out.println("集合中第三个元素为："+names.get(2));
        System.out.println("现在集合的大小为："+names.size());
    }
}
