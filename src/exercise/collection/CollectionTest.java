package exercise.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList();
        System.out.println(coll);
        // `public boolean add(E e) `：把给定的对象添加到当前集合中。
        coll.add("zqy");
        System.out.println(coll);
        // `public void clear()`：清空集合中所有的元素。
        coll.clear();
        System.out.println(coll);
        // `public boolean remove(E e)`：把给定的对象在当前集合中删除。
        coll.add("hhhhh");
        coll.add("zqy");
        coll.add("wmz");
        coll.remove("hhhhh");
        System.out.println(coll);
        // `public boolean contains(E e)`：判断当前集合中是否包含给定的对象。
        System.out.println(coll.contains("zqy"));
        // `public boolean isEmpty()`：判断当前集合是否为空。
        System.out.println(coll.isEmpty());
        // `public int size()`：返回集合中元素的个数。
        System.out.println(coll.size());
        // `public Object[] toArray()`：把集合中的元素存储到数组中。
        Object[] toArray = coll.toArray();
        for (int i = 0; i < toArray.length; i++) {
            System.out.println(toArray[i]);
        }
    }
}
