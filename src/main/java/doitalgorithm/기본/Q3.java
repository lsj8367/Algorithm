package doitalgorithm.기본;

import java.util.Scanner;

public class Q3 {
	//네값의 최소값 구하기
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("네값중 최소값 구하기");
		
		System.out.println("a : ");
		int a = sc.nextInt();
		System.out.println("b : ");
		int b = sc.nextInt();
		System.out.println("c : ");
		int c = sc.nextInt();
		System.out.println("d : ");
		int d = sc.nextInt();
		
		int result = min4(a,b,c,d);
		System.out.println("최소값은 " + result + " 입니다.");
	}
}
