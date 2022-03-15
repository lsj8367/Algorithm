package doitalgorithm.기본;

import java.util.Scanner;

public class Q1 {
	//네값의 최대값을 구하는 max4
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("네값의 최대값을 구하는 max4");
		System.out.println("a입력 : ");
		int a = sc.nextInt();
		System.out.println("b입력 : ");
		int b = sc.nextInt();
		System.out.println("c입력 : ");
		int c = sc.nextInt();
		System.out.println("d입력 : ");
		int d = sc.nextInt();
		
		int result = max4(a,b,c,d);
		System.out.println("최대값은 " + result + "입니다.");
		
	}
}
