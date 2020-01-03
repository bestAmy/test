package exercise.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<String>();
        coll.add("zqy");
        coll.add("张三");
        coll.add("网二");
        coll.add("wmz");
        coll.add("hhh");
        Iterator<String> iterator=coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String i:coll){
            System.out.println(i);
        }
    }
}
