package cn.wupn.demo5;

public class StringCourite {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("第一个字符串："+str1);
        char[] c = {'A','B','C'};
        String str2 = new String(c);
        System.out.println("第二个字符串："+str2);
        byte[] b = {97,98,99};
        String str3 = new String(b);
        System.out.println("第三个字符串："+str3);
    }
}
