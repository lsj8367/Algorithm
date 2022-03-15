package doitalgorithm.기본;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		//자릿수를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		int a;
		do {
			System.out.println("숫자를 입력하세요");
			a = sc.nextInt();			
		} while (a <= 0);
		
		int n = 0;
		while(a > 0) {
			System.out.println(a);
			a /= 10;
			n++;
		}
		
		System.out.println("그 수는 " + n + "자리입니다.");
		
	}
}
