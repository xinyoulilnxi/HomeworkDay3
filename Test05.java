package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        String regex = "[0-9]{18}";
        while(true) {
            String str = console.next();
            if (str.matches(regex)) {
                System.out.println("格式正确");
                birthday(str);
                break;
            } else {
                System.out.println("请重新输入");
            }
        }

    }
    public static void birthday(String str) throws ParseException {
        StringBuilder stringBuilder = new StringBuilder();
        String str0 = str.substring(6,14);
        stringBuilder.append(str0);
        stringBuilder.insert(4,"-");
        stringBuilder.insert(7,"-");
        String str1 = stringBuilder.toString();
        System.out.println(str1);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sf.parse(str1);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR,20);
        Date date1 = calendar.getTime();
        System.out.println(sf.format(date1));
        calendar.set(calendar.DAY_OF_WEEK,calendar.WEDNESDAY);
        Date date2 = calendar.getTime();
        System.out.println(sf.format(date2));


    }
}
