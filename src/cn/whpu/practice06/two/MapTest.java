package cn.whpu.practice06.two;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> person=new HashMap<>();
        person.put("id","1");
        person.put("name","张三");
        person.put("sex","男");
        person.put("age","25");
        person.put("love","爱学java");
        for(String key:person.keySet()){
            System.out.println(key+":"+person.get(key));
        }
        System.out.println("集合的大小为："+person.size());
        System.out.println("删除的内容为："+person.remove("age"));
        System.out.println("现在集合的大小为："+person.size());
    }
}
