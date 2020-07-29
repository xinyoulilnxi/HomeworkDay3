package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) throws ParseException {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        StringBuilder str = new StringBuilder();
        Collection<Emp> col = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String name = console.next();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            String str1 = str.toString();
            if((str1.contains(name))) {
                System.out.println("该用户已输入");
            }else{
                col.add(new Emp(name, console.nextInt(), console.next(), console.nextInt(), sf.parse(console.next())));
                str.append(name); }
            }
        System.out.println(col.toString());
        col.clear();

    }

}
