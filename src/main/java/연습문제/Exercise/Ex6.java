package 연습문제.Exercise;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//두수의 최대공약수 구하기
		int a, b, big, small, num;
		System.out.println("첫번째 수를 입력하세요");
		a = sc.nextInt();
		System.out.println("두번째 수를 입력하세요");
		b = sc.nextInt();
		
		if(a > b) {
			big = a;
			small = b;
		}else{
			big = b;
			small = a;
		}
		
		num = 1; //최대공약수는 1부터시작해서 1로 초기화값.
		for(int i = 1; i <= small ; i++) {
			if(big % i == 0 && small % i == 0) {
				num = i;
			}
		}
		System.out.println(a + " 와 " + b + "의 최대공약수는 : " + num);
		
		
	}
	
	
	
	
}
