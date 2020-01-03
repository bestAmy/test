package exercise.system;

import java.util.Arrays;

public class TestFor {
    public static void main(String[] args) {
        /*long l1 = System.currentTimeMillis();
        for (int i = 1; i <9999 ; i++) {
            System.out.println(i);
        }
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l1);*/

        //复制数组
        int[] src={1,2,3,4,5};
        int[] dest={6,7,8,9,10};
        System.arraycopy(src,0,dest,0,3);
        System.out.println("src变为："+ Arrays.toString(src));
        System.out.println("dest变为："+Arrays.toString(dest));
    }
}
