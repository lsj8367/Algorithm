package doitalgorithm.기본;

import java.util.Scanner;

public class JudgeSign {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int n = sc.nextInt();
		
		if(n > 0) {
			System.out.println("이 수는 양수입니다.");
		}else if(n < 0) {
			System.out.println("이 수는 음수입니다.");
		}else {
			System.out.println("이 수는 0입니다.");
		}
		
//		if(n == 1) {
//			System.out.println("이 수는 1입니다.");
//		}else if(n == 2) {
//			System.out.println("이 수는 2입니다.");
//		}else if(n == 3) {
//			System.out.println("이 수는 3입니다.");
//		}
		
	}
}
