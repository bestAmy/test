package exercise_two;

public class ArrayPrint {
    public static void main(String[] args) {
        intArray a = new intArray();
        int[] ar = {1, 2, 3, 2};
        a.printArray(ar);
        System.out.println();
        a.printArray(a.reverse(ar));
    }
}
    class intArray{
    //private int[] array;
    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
    public static int[] reverse(int[] list){
        //int[] a=new int[list.length];
        for(int i=0;i<list.length/2;i++){
            int temp;
            temp=list[i];
            list[i]=list[list.length-i-1];
            list[list.length-i-1]=temp;
        }
        return list;
    }
}
