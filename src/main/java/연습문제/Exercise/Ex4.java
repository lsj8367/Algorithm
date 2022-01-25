package 연습문제.Exercise;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		String abc;
		System.out.println("10진수를 2진수로 변환");
		System.out.println("숫자를 입력하세요.");
		input = sc.nextInt();
		String a = Integer.toBinaryString(input);
		System.out.println("입력하신 숫자" + input + "의 2진수는 -> " + a + "입니다.");
		System.out.println();
		System.out.println("계속하시려면(y/n)");
		while(true) {
			abc = sc.next();
			if(abc.equals("y")) {
				System.out.println("숫자를 입력하세요.");
				input = sc.nextInt();
				a = Integer.toBinaryString(input);
				System.out.println("입력하신 숫자" + input + "의 2진수는 -> " + a + "입니다.");
				System.out.println("계속하시겠습니까? (y/n)");
			}else if(abc.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		
		
	}
}
