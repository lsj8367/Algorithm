package 기본;

import java.util.Scanner;

public class Q9 {
	static int sumof(int a, int b) {
		// 정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하기
		int sum = 0;
		
		if(a < b) {
			for(int i = a; i <= b; i++) {
				sum += i;
			}			
		}else {
			for(int i = b; i <= a; i++) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(sumof(a, b));
	}
}
