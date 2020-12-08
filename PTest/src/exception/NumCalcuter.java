package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class NumberRangeException extends Exception {
	public NumberRangeException(String msg) {
		super(msg+"���ݷ�Χ����");
	}
}

public class NumCalcuter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b;
		try {
			System.out.println("�����������������:");
			a=sc.nextDouble();
			b=sc.nextDouble();
			if(a<=0||b<=0) {
				throw new NumberRangeException("��һ����"+a+",�ڶ�����"+b);
			}
			System.out.println("����֮����:"+(a+b));
		}catch(InputMismatchException e) {
			System.out.println("����������Ŷ��");
		}catch(NumberRangeException e){
			System.out.println(e.toString());
		}
	}
}
