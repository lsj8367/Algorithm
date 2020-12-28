package Exercise;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// 숫자사각형 1
		// 숫자를 입력받아 그수로 구성된 n행,n열의 형태로 연속으로 출력되는 사각형 출력하기 (짝수행은 반대로)
		// 예) 4를 입력받으면
		//	1 2 3 4
		//	8 7 6 5
		//	9 10 11 12
		//	16 15 14 13
		
		Scanner sc = new Scanner(System.in);
		System.out.println("행렬 수 입력");
		int a = sc.nextInt();
		//int a = 5;
		int arr[][] = new int[a][a];
		int count = 0;
		
		
		for(int i = 0; i < a; i++) {
			if(i % 2 == 0) { //짝수
				for(int j = 0; j < a; j++) { //홀수행 1열부터 ~ 끝열까지
					count++;
					arr[i][j] = count;
				}
			}else { //홀수
				for(int j = a - 1; j >= 0; j--) { //짝수행 끝열에서 1열로
					count++;
					arr[i][j] = count;
				}
			}
		}
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < a; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
