package practic_one;
public class Game {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        for(int i=1;i<=5;i++){
            for(int j=5-i;j>0;j--){
                System.out.print(" ");
            }
            int n=i;
            int q=i;
            for(int m=1;m<=i;m++){
                System.out.print(n);
                //n--;
                if(n<=1){
                    for(int k=1;k<=q-1;k++){
                        n++;
                        System.out.print(n);
                    }
                }
                else{
                    n--;
                }
            }
            System.out.println("");
        }

    }

}

