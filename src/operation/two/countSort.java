package operation.two;

public class countSort {
    public static void main(String[] args) {
        int[] a1={1,1,3,4,5,4,3,2,6,3};
        System.out.println("原来的数列为：");
        for (int value : a1) {
            System.out.print(value + " ");
        }
        System.out.println();
        //System.out.println("排序后的数列为：");
        count(a1);
    }
    public static void count(int[] a){
        int max=a[1],min=a[1];
        for (int value : a) {
            if (max < value) {
                max = value;
            }
            if (min > value) {
                min = value;
            }
        }
        int[] b=new int[max-min+1];
        for(int i=0;i<max-min+1;i++){
            b[i]=0;
        }
        for (int value : a) {
            for (int j = 0; j < (max - min + 1); j++) {
                if (value - min == j) {
                    b[j] = b[j] + 1;
                }
            }
        }
        for (int i = 1; i <(max-min+1) ; i++) {
            b[i]=b[i]+b[i-1];
        }
        System.out.println("每个数的偏移量为：");
        for (int i : b) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("存入的顺序为：");
        //依次将数列中的值根据偏移量存入数组
        int[] c=new int[a.length];
        for (int item : a) {
            for (int i1 = 0; i1 < b.length; i1++) {
                if (item - 1 == i1) {
                    c[b[i1] - 1] = item;
                    b[i1] = b[i1] - 1;
                    for (int i : c) {
                        System.out.print(i+" ");
                    }
                    System.out.println();
                }
            }
        }
        System.out.println("排除后的数列为：");
        for (int value : c) {
            System.out.print(value + " ");
        }

        //System.out.println(max+" "+min);
    }
}
