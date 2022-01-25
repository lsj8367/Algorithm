package 연습문제.Exercise;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		//팩토리얼 구하기 ex) 5입력하면  5! = 5*4*3*2*1
		
		Scanner sc = new Scanner(System.in);
		//int a = 5;
		System.out.println("숫자를 입력하세요");
		int a = sc.nextInt();
		int b = 1; //팩토리얼은 1입력하면 1자체라서 1로 초기화를 시켜줬음.
		
		for(int i = a; i > 0; i--) { //모양이 a,a-1,a-2,......
			b *= i; //1부터 정해진 값 까지 곱해야됨
		}
		
		/*
		for(int i = 1; i <= a; i++) { //모양이 1*2*3*4*...
			b = b * i;
		}
		*/		
		System.out.println(a +"! = " + b);
		
	}

}
