package userInfo;

import java.util.Date;
//客户的基本信息
public class UserInfomation {
    private int _id;
    private String password;
    private Date birthDay;
    private Date registerDay;
//    private enum status;

    public UserInfomation() {
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Date getRegisterDay() {
        return registerDay;
    }

    public void setRegisterDay(Date registerDay) {
        this.registerDay = registerDay;
    }

//    @Override
//    public String toString() {
////        return "UserInfomation{" +
////                "_id=" + _id +
////                ", password='" + password + '\'' +
////                ", birthDay=" + birthDay +
////                ", registerDay=" + registerDay +
////                '}';
//        return "ok";
//    }
}
