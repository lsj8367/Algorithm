package ex01;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		//while문이 종료될때 i값이 n+1이 됨을 확인하라.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println(i);
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");		

	}
	
}
