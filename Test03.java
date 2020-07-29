package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {


        Scanner console = new Scanner(System.in);
        String str = console.next();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sf.parse(str);
        long time = date.getTime();
        time = -time;
        Date date1 = new Date();
        long time1 = date1.getTime();
        long time2 = ((time1 + time) / 1000 / 60 / 60 / 24 / 7);
        System.out.println(time2);

    }
}
