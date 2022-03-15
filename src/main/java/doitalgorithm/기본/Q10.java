package doitalgorithm.기본;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		// 두 정수 변수 a,b를 입력받고 b-a를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a의 값 : ");
		int a = sc.nextInt();
		
		System.out.println("b의 값 : ");
		int b = sc.nextInt();
		
		while(b <= a) {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.println("b의 값 : ");
			b = sc.nextInt();
		}
		
		System.out.println("b - a는 " + (b - a) + "입니다.");
	}
}
