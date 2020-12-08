package part314;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class DateCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������:");
		int year = sc.nextInt();
		System.out.println("�����·�:");
		int month = sc.nextInt();
		System.out.println("��������:");
		int date = sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, 1);

		int week = c.get(Calendar.DAY_OF_WEEK);
		String days = " ";
		switch (week) {
		case 0:
			days = "��";
			break;
		case 1:
			days = "��";
			break;
		case 2:
			days = "һ";
			break;
		case 3:
			days = "��";
			break;
		case 4:
			days = "��";
			break;
		case 5:
			days = "��";
			break;
		case 6:
			days = "��";
			break;
		}
		int max = c.getActualMaximum(Calendar.DATE);
		c.set(year, month - 1, date);
		int week1 = c.get(Calendar.DAY_OF_WEEK);
		String days1 = " ";
		switch (week1) {
		case 0:
			days1 = "��";
			break;
		case 1:
			days1 = "��";
			break;
		case 2:
			days1 = "һ";
			break;
		case 3:
			days1 = "��";
			break;
		case 4:
			days1 = "��";
			break;
		case 5:
			days1 = "��";
			break;
		case 6:
			days1 = "��";
			break;
		}
		System.out.println(year + "��" + month + "��" + date + "��������" + days1);
		
		System.out.println(year + "��" + month + "�µ�����Ϊ:");
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
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
		System.out.println("�����һ�����ڵ������գ����ÿո�ֿ�:");
		LocalDate date1 = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println("����ڶ������ڵ������գ����ÿո�ֿ�:");
		LocalDate date2 = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
		long day = Math.abs(date1.toEpochDay() - date2.toEpochDay());
		System.out.printf("���������������%d��\n", day);
	}
}