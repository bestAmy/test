package cn.whpu.practice03.three;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarBean {
    public static void main(String[] args) {
        System.out.println("Please input year:");
        Scanner sc1=new Scanner(System.in);
        int year=sc1.nextInt();
        System.out.println("Please input month:");
        Scanner sc2=new Scanner(System.in);
        int month=sc2.nextInt();
        Calendar calendar=Calendar.getInstance();
        calendar.set(year,month,1);
        int week=calendar.get(Calendar.DAY_OF_WEEK)-1;
        int day = 0;
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            day=31;
        }else if(month==4||month==6||month==9||month==11){
            day=30;
        }else if(month==2){
            if(((year%4==0)&&(year%100!=0))||(year%400==0)){
                day=29;
            }else{
                day=28;
            }
        }else{
            System.out.println("不存在该月份");
        }
        String[] we={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        for(String c:we){
            System.out.print(c+"   ");
        }
        String[] a=new String[42];
        for(int i=0;i<week;i++){

            a[i]=" ";
        }
        for(int i=week,n=1;i<week+day;i++){
            a[i]=String.valueOf(n);
            n++;
        }
        for(int i=week+day;i<a.length;i++){
            a[i]=" ";
        }
        for(int i=0,n=0;i<a.length;i++){
            if(i%7==0){
                System.out.println("");
            }

            //int m=we[i].length()+3;
            System.out.printf("%-11s",a[i]);
        }

    }
}
