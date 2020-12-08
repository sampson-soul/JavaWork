package part314;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class DateCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入年份:");
		int year = sc.nextInt();
		System.out.println("输入月份:");
		int month = sc.nextInt();
		System.out.println("输入日期:");
		int date = sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, 1);

		int week = c.get(Calendar.DAY_OF_WEEK);
		String days = " ";
		switch (week) {
		case 0:
			days = "六";
			break;
		case 1:
			days = "日";
			break;
		case 2:
			days = "一";
			break;
		case 3:
			days = "二";
			break;
		case 4:
			days = "三";
			break;
		case 5:
			days = "四";
			break;
		case 6:
			days = "五";
			break;
		}
		int max = c.getActualMaximum(Calendar.DATE);
		c.set(year, month - 1, date);
		int week1 = c.get(Calendar.DAY_OF_WEEK);
		String days1 = " ";
		switch (week1) {
		case 0:
			days1 = "六";
			break;
		case 1:
			days1 = "日";
			break;
		case 2:
			days1 = "一";
			break;
		case 3:
			days1 = "二";
			break;
		case 4:
			days1 = "三";
			break;
		case 5:
			days1 = "四";
			break;
		case 6:
			days1 = "五";
			break;
		}
		System.out.println(year + "年" + month + "月" + date + "号在星期" + days1);
		
		System.out.println(year + "年" + month + "月的月历为:");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for (int j = 1; j < week; j++) {
			System.out.print(" ");
			System.out.print("\t");
		}
		int tag = week;
		for (int i = 1; i <= max; i++) {
			System.out.print(i);
			System.out.print("\t");
			if (tag % 7 == 0) {
				System.out.println("\n");
			}
			tag++;
		}
		System.out.println("\n");
		System.out.println("输入第一个日期的年月日，并用空格分开:");
		LocalDate date1 = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println("输入第二个日期的年月日，并用空格分开:");
		LocalDate date2 = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
		long day = Math.abs(date1.toEpochDay() - date2.toEpochDay());
		System.out.printf("这两个日期相差了%d天\n", day);
	}
}