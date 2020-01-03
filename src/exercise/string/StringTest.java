package exercise.string;

public class StringTest {
    public static void main(String[] args) {
        int[] a={1,2,3};
        System.out.println(pingJie(a));
    }
    static String pingJie(int[] a){
        String str1="[";
        String str2="word";
        String str3="#";
        String str4="]";
        String str5="";
        for (int i = 0; i < a.length; i++) {
            str5=str5.concat(str2).concat(String.valueOf(a[i])).concat(str3);
        }
        return str1.concat(str5).concat(str4);
    }
}
