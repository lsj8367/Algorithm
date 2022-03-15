package doitalgorithm.연습문제.Exercise;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//구구단 s부터 f단까지 출력하기
		//예) 2 3 입력하면 2~3단 출력
		System.out.println("구구단");
		int result = 0;
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				result = i * j;
				System.out.print(j + " * " + i + " = " + result + "   ");
			}
			System.out.println();
		}
		
		
		while(true) {
		System.out.println("계속하나요? (y/n)");
		String a = sc.next();
		
		if(a.equals("y")) {
			int s = sc.nextInt();
			System.out.print("에서");
			int f = sc.nextInt();
			
			for(int i = 1; i <= 9; i++) {
				for(int j = s; j <= f; j++) {
					result = j * i;
					System.out.print(j + " * " + i + " = " + result + "   ");
				}
				System.out.println();
			}
			//System.out.println("계속하나요? (y/n)");
		}else if(a.equals("n")){
			System.out.println("프로그램을 종료합니다");
			break;
		}else {
			System.out.println("y또는 n만 가능합니다.");
			continue;
		}
		
	}
		
		
		
	}
}
