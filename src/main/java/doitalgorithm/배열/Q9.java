package doitalgorithm.배열;

import java.util.Scanner;

public class Q9 {
	//y년 m월 d일의 그해 남은 일 수 (12월 31일이면 0, 12월30일이면 1)를 구하는 프로그램
	// 각 달의 일 수
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 윤년
	};

	// 서기 year년은 윤년인가? (윤년：1／평년：0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}

	// 서기 y년 m월 d일의 연내의 남은 일 수를 구합니다.
	static int leftDayOfYear(int y, int m, int d) {
		int days = d;
		for(int i = 1; i < m; i++) {
			days += mdays[isLeap(y)][i - 1]; //1월부터 m-1월까지의 총 일수
		}
		
		return 365 + isLeap(y) - days;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry; // 한 번 더 할건지 물어보는 변수

		System.out.println("연 남은 일 수를 구합니다.");

		do {
			System.out.print("년：");
			int year = stdIn.nextInt(); // 년
			System.out.print("월：");
			int month = stdIn.nextInt(); // 월
			System.out.print("일：");
			int day = stdIn.nextInt(); // 일

			System.out.printf("연 남은 일 수는 %d일입니다.\n", leftDayOfYear(year, month, day));

			System.out.print("한번 더 할까요? (1.예/0.아니오)：");
			retry = stdIn.nextInt();
		} while (retry == 1);
	}
}
