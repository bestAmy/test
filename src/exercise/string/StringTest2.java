package exercise.string;

import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        int number=0,bigZimu=0,smallZimu=0,other=0;
        char[] a=str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if(a[i]>='0'&&a[i]<='9'){
                number++;
            }else if(a[i]>='a'&&a[i]<='z'){
                smallZimu++;
            }else if(a[i]>='A'&&a[i]<='Z'){
                bigZimu++;
            }else{
                other++;
            }

        }
        System.out.println("大写字母出现的次数为："+bigZimu);
        System.out.println("小写字母出现的次数为："+smallZimu);
        System.out.println("数字出现的次数为："+number);
        System.out.println("其他种类出现的次数为："+other);
    }
}
