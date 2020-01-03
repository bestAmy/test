package exercise.Dateformt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        //将日期格式化
        SimpleDateFormat spl = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date=new Date();
        String s1=spl.format(date);
        System.out.println(s1);

        //将格式化的日期转换成date
        Date date1 = spl.parse("2019年11月03日 22时21分47秒");
        System.out.println(date1);
    }
}
