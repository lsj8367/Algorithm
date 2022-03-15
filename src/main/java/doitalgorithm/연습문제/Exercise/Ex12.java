package doitalgorithm.연습문제.Exercise;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// 숫자 사각형 3
		//  1 5 9 13
		//	2 6 10 14
		//	3 7 11 15
		//	4 8 12 16
		//이런 형식으로 만들기
		//int a = 4;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("보고자하는 행렬을 입력하세요.");
		int a = sc.nextInt();
		
		int[][] arr = new int[a][a];
		int count = 0;
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				count++;
				arr[i][j] = count;
			}
		}
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				System.out.printf("%4d", arr[j][i]);
			}
			System.out.println();
		}

	}

}
