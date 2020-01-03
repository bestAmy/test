package cn.whpu.demo08.exercise.two;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class TestUserDAO {
    public static void main(String[] args) throws ParseException {
        UserDAO userDAO=new UserDAO();
        userDAO.select(new User(1));
        User user1=new User(4,"郑千叶","123456","ermazi@sina.com", "1999-05-22");
        userDAO.insert(user1);
        userDAO.delete(new User(4));
        userDAO.update(new User(1,"zs","12345678"));
    }
}
