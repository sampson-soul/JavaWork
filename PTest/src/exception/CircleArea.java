package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try {
		System.out.println("����Բ�İ뾶:");
		double r = sc.nextDouble();
		System.out.println("Բ�������:"+ Math.PI*r*r);
	}catch(InputMismatchException e) {
		System.out.println("������һ������");
	}finally {
		System.out.println("����һ�ΰɣ�");
	}
	}
}