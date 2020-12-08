package exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try {
		System.out.println("输入圆的半径:");
		double r = sc.nextDouble();
		System.out.println("圆的面积是:"+ Math.PI*r*r);
	}catch(InputMismatchException e) {
		System.out.println("请输入一个数！");
	}finally {
		System.out.println("再试一次吧！");
	}
	}
}