package day05;

public class puke {
    public static void main(String[] args) {
        pu p = new pu();
        for(int i=0;i<4;i++){
            p.randomSuit();
            System.out.print(" ");
            p.randomRanks();
        }

    }
}
class pu{
    private String[] suits= {"Spades", "Hearts", "Clubs", "Diamonds"};
    private String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public String[] getSuits() {
        return suits;
    }

    public String[] getRanks() {
        return ranks;
    }
    public void randomRanks(){
        int index=(int)(Math.random()* ranks.length);  //随机生成一个数组下标
        //System.out.println(index);
        //System.out.println(ranks.length);
        System.out.println(ranks[index]);  //将该数组的一个量输出
    }
    public void randomSuit(){
        int index=(int)(Math.random()*suits.length);
        System.out.print(suits[index]);
    }
}