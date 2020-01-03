package userInfo;

import java.util.Date;
// 信用卡的信息
public class cardInfo {
    private int cardNUm;
    private Date registerDay;

    public int getCardNUm() {
        return cardNUm;
    }

    public Date getRegisterDay() {
        return registerDay;
    }

    public void setCardNUm(int cardNUm) {
        this.cardNUm = cardNUm;
    }

    public void setRegisterDay(Date registerDay) {
        this.registerDay = registerDay;
    }
}
