package ex01;

import java.util.Scanner;

public class Median {
	static int med3(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			}else if(a <= c) {
				return a;
			}else {
				return c;
			}
		}else if(a > c) {
			return a;
		}else if(b > c) {
			return c;
		}else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("중간값 구하기");
		
		System.out.println("a의 값");
		int a = sc.nextInt();
		System.out.println("b의 값");
		int b = sc.nextInt();
		System.out.println("c의 값");
		int c = sc.nextInt();
		
		int result = med3(a, b, c);
		System.out.println("중간값은 " + result + " 입니다.");
	}
}
