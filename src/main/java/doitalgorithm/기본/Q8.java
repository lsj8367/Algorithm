package doitalgorithm.기본;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		// 가우스 덧셈 (n)(a + n) * 0.5 알고리즘
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값：");
		int n = sc.nextInt();
		
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 합

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		
	}
}
