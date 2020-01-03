package operation.three;

public class MaxSame {
    public static void main(String[] args) {
        System.out.println("输入的两个字符串为："+"tagebuvf"+"  fwefbhefbv");
        lcs("tagebuvf","fwefbhefbv");
    }
    public static void lcs(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        String str3="";
        int c[][] = new int[len1 + 1][len2 + 1];
        int max=0;
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if (i == 0 || j == 0) {
                    c[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                    if(c[i][j]>max){
                        max=c[i][j];
                        str3=str3+str2.charAt(j-1);
                    }
                } else {
                    c[i][j] =Math.max(c[i - 1][j], c[i][j - 1]);
                }
            }

        }
        System.out.println("最长公共子序列的长度为："+c[len1][len2]);
        System.out.println("最长公共子序列为："+str3);
    }
}
