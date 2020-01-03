package userInfo;

import java.io.ObjectStreamException;

public class band {
    public static void main(String[] args) {
        cardInfo card =new cardInfo();
        UserInfomation user = new UserInfomation();
        card.setCardNUm(123);
//        System.out.println(card.getCardNUm());
        System.out.println(card.getCardNUm());
        System.out.println(user);
        Object o = new Object();
    }

}