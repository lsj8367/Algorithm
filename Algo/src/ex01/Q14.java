package ex01;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// 정수를 입력받고 그 수를 한변으로 하는 정사각형 만들기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사각형을 출력합니다.");
		System.out.println("단 수 : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("*");
			for(int j = 1; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
