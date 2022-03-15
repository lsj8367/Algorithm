package doitalgorithm.연습문제.Exercise_2;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// 다음 입력 n을 받아 아래와 같은 *을 출력하시오.
		// n : 5;
		// *
		// **
		// ***
		// ****
		// *****
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값 입력");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}

	}

}
