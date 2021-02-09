package ex02;

import java.util.Scanner;

public class Q8 {
	// dayOfYear 메소드를 변수i와 days 없이 구현 while문 사용할 것.
	static int[][] mdays = { //각 달의 일수
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} //윤년
	};
	
	// 서기 year년은 윤년인가? (윤년 : 1 / 평년 : 0)
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	//서기 y년 m월 d일의 그 해 경과 일 수를 구함
	static int dayOfYear(int y, int m, int d) {
		while(--m != 0) {
			d += mdays[isLeap(y)][m - 1]; 
		}
		return d;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry; //한번 더 할건지 유무 확인용 변수
		
		System.out.println("그 해 경과 일수를 입력하세요.");
		
		do {
			System.out.print("년 : ");
			int year = sc.nextInt(); //년
			System.out.print("월 : ");
			int month = sc.nextInt(); //월
			System.out.print("일 : ");
			int day = sc.nextInt(); //일
			
			System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
			
			System.out.print("한번 더 할까요? (1.예 / 0.아니오)");
			retry = sc.nextInt();
		}while(retry == 1);
	}
}
