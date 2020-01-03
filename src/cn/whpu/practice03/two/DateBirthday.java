package cn.whpu.practice03.two;

import java.util.Calendar;
import java.util.Scanner;

public class DateBirthday {
    public static void main(String[] args) {
        System.out.println("请输入出生日期 格式 YYYY-MM-dd");
        Scanner sc=new Scanner(System.in);
        String birthday=sc.next();
        if(birthday.contains("-")){
            String[] arr=birthday.split("-");
            int birthdayYear=Integer.parseInt(arr[0]);
            int birthdayMonth=Integer.parseInt(arr[1]);
            int birthdayDay=Integer.parseInt(arr[2]);
            Calendar calendar = Calendar.getInstance();
            long time1=calendar.getTimeInMillis();
            calendar.set(birthdayYear,birthdayMonth-1,birthdayDay);
            long time2=calendar.getTimeInMillis();
            long day=(time1-time2)/(1000*60*60*24);
            System.out.println("已经在世上生活了"+day+"天");
        }
        else {
            System.out.println("格式输入错误，请重新输入");
        }

    }
}
