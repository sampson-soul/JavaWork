package part313;

import java.util.Scanner;

class TriangleAreaCalculator {
	public static void main(String [] args){		
		System.out.println("******************");
		System.out.println("***���������������***");
		System.out.println("******************");
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		float s, area;
		
		while(true){
			System.out.println("�����������εĵ�һ���߳���");
			a = sc.nextInt();
			System.out.println("�����������εĵڶ����߳���");
			b = sc.nextInt();
			System.out.println("�����������εĵ������߳���");
			c = sc.nextInt();
			
			if(a + b > c && a + c > b && b + c > a){
				s = (a + b + c) / 2f;
				area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
				System.out.println("�����ε������:" + area);
			}else {
				System.out.println("����������������������߲��ܹ��������Ρ�����������!");		
				continue;
			}
			break;
		}
	}
}
