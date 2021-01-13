package ex01;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("행수 입력 : ");
		int n = sc.nextInt();
		
		triangleLB(n);
		System.out.println();
		
		triangleLU(n);
		System.out.println();
		
		triangleRU(n);
		System.out.println();
		
		triangleRB(n);
	}
	
	static void triangleLB(int n) { //왼쪽 아래가 직각인 이등변 삼각형 출력
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) { //왼쪽 위가 직각인 이등변 삼각형 출력
		for(int i = 0; i < n; i++) {
			for(int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	
	static void triangleRU(int n) { //오른쪽 위가 직각인 이등변 삼각형 출력
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = n; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n) { //오른쪽 아래가 직각인 이등변 삼각형 출력
		for(int i = 0; i < n; i++) {
			for(int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
