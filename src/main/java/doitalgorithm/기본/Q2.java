package doitalgorithm.기본;

import java.util.Scanner;

public class Q2 {
	//세값의 최소값을 구하는 min3
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세값의 최소값");
		
		System.out.println("a 입력 : ");
		int a = sc.nextInt();
		System.out.println("b 입력 : ");
		int b = sc.nextInt();
		System.out.println("c 입력 : ");
		int c = sc.nextInt();
		
		int result = min3(a,b,c);
		System.out.println("최소값은 " + result + "입니다.");
		
	}
	
	
}
