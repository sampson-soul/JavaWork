package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class NumberRangeException extends Exception {
	public NumberRangeException(String msg) {
		super(msg+"数据范围不对");
	}
}

public class NumCalcuter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b;
		try {
			System.out.println("输入两个大于零的数:");
			a=sc.nextDouble();
			b=sc.nextDouble();
			if(a<=0||b<=0) {
				throw new NumberRangeException("第一个数"+a+",第二个数"+b);
			}
			System.out.println("两数之和是:"+(a+b));
		}catch(InputMismatchException e) {
			System.out.println("请输入正数哦！");
		}catch(NumberRangeException e){
			System.out.println(e.toString());
		}
	}
}
