package runoob;

import java.util.*;
import java.text.*;

/**
 * 使用printf格式化日期 printf 方法可以很轻松地格式化时间和日期。使用两个字母格式，它以 %t 开头并且以下面表格中的一个字母结尾。
 * 
 * %tY：输出四位数的年份，例如：2023 
 * %ty：输出两位数的年份，例如：23 
 * %tm：输出两位数的月份，例如：02
 * %tB：输出月份的全名，例如：February 
 * %tb：输出月份的缩写，例如：Feb 
 * %tA：输出星期的全名，例如：Wednesday
 * %ta：输出星期的缩写，例如：Wed 
 * %td：输出两位数的日期，例如：24 
 * %te：输出一位或两位数的日期，例如：24 或 02
 * %tH：输出24小时制的小时数，例如：23 
 * %tI：输出12小时制的小时数，例如：11 
 * %tM：输出分钟数，例如：45 
 * %tS：输出秒数，例如：30
 * %tp：输出上午还是下午，例如：AM 或 PM 
 * %tZ：输出时区，例如：GMT+08:00
 *
 */

public class A09_Date {
	public static void main(String[] args) {

		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		System.out.println("当前时间为: " + ft.format(date));

		System.out.printf("%s %tY-%tm-%td %tH:%tM:%tS %tZ\n", "当前时间为:", date, date, date, date, date, date, date);
		System.out.printf("%1$s %2$tY-%2$tm-%2$td %2$tH:%2$tM:%2$tS %2$tZ\n", "Due date:", date);
		System.out.printf("%s %tY-%<tm-%<td %<tH:%<tM:%<tS %<tZ\n", "Due date:", date);

	}
}
