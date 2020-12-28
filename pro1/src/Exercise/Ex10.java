package Exercise;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 숫자사각형 1
		// 숫자를 입력받아 그수로 구성된 n행,n열의 형태로 연속으로 출력되는 사각형 출력하기
		// 예) 4를 입력받으면
		//	1 2 3 4
		//	5 6 7 8
		//	9 10 11 12
		//	13 14 15 16
		Scanner sc = new Scanner(System.in);
		//int a = 4; //행렬 만들 수.
		System.out.println("행렬 수 입력");
		int a = sc.nextInt();
		int cou = 0;
		int count = 0; //1부터 차례대로 출력하려고
		for(int i = 1; i <= a; i++) { //0부터주면 a+1의 행렬이 나옴
			for(int j = 1; j <= a; j++) {
				count++;
				System.out.print(count + " "); // 1 2 3 4의 count 셈 출력 4번
			}
			cou++;
			System.out.println(cou); //행출력 반복 1번씩
		}
		
		
		
		
	}

}
