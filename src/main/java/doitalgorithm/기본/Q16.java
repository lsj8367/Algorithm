package doitalgorithm.기본;

import java.util.Scanner;

public class Q16 {
	public static void main(String[] args) {
		// 피라미드 별찍기
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int n = sc.nextInt();
		//int n = 4;
		spira(n);
		npira(n);

	}
	
	static void spira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < (((i - 1) * 2) + 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	
	static void npira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < (((i - 1) * 2) + 1); k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
