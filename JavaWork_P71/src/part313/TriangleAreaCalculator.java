package part313;

import java.util.Scanner;

class TriangleAreaCalculator {
	public static void main(String [] args){		
		System.out.println("******************");
		System.out.println("***三角形面积计算器***");
		System.out.println("******************");
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		float s, area;
		
		while(true){
			System.out.println("请输入三角形的第一条边长：");
			a = sc.nextInt();
			System.out.println("请输入三角形的第二条边长：");
			b = sc.nextInt();
			System.out.println("请输入三角形的第三条边长：");
			c = sc.nextInt();
			
			if(a + b > c && a + c > b && b + c > a){
				s = (a + b + c) / 2f;
				area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
				System.out.println("三角形的面积是:" + area);
			}else {
				System.out.println("您输入的数据有误，这三条边不能构成三角形。请重新输入!");		
				continue;
			}
			break;
		}
	}
}
