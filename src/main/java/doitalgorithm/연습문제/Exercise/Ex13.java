package doitalgorithm.연습문제.Exercise;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		//숫자 사각형 4
		//	1	2	3	4
		//	2	4	6	8
		//	3	6	9	12
		//	4	8	12	16
		//이런식으로 보이는 행렬
		//int a = 4;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int a = sc.nextInt();
		int[][] arr = new int[a][a];
		int count = 0;
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				arr[i][j] = (i + 1) * (j + 1);
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.printf("%4d" , arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
}
