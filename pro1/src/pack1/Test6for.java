package pack1;

import java.util.Scanner;

public class Test6for {
	public static void main(String[] args) {
		/*
		// 반복문 for(초기치;조건;증가치){}
		int a;
		int hap = 0;  //누적 기억장소 : 초기화 권장
		for(a = 1; a <= 10;  a++) { //a 는 for문 안에서 변수선언을 하여 지역변수가 된다. 밖에서 사용 x
			System.out.print(a + "\t");
			//a = 3; 무한루프 1+3 더한값 계속 출력
			hap += a;
		}
		System.out.println("\na :" + a);
		System.out.println("10 까지의 합은 " + hap);
		
		System.out.println();
		for (int i = 65; i <= 90 ; i++) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print((int)i + " ");
		}		
		System.out.println();
		for(int i = 4 + 6; i > 1; i -= 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int ytn=0, tv = 5; ytn <= 5; ytn++, tv++) {
			System.out.print(ytn + " " + tv + " : ");
		}
		
		System.out.println();
		int aa = 1;
		for(; aa <= 5; aa++) {
			if(aa == 2) System.out.println("만세");
			System.out.println(aa + " ");
		}
		System.out.println("\n다중 for --------------");
		for(int m=1; m<=3; m++) {
			System.out.println("m=" + m);
			for(int n= 1; n<= 4; n++) {
				System.out.print("n : " + n + " ");
			}
			System.out.println();			
		}
		System.out.println();
		for(char i = 65; i <= 90; i++) {
			System.out.print(i + " : ");
			for(char j = i; j <= 'Z'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		//구구단 출력
		for(int count = 1; count < 10 ; count++) {
			System.out.println("3 * " + count + "=" + (3 * count));
		}*/
		
		//문제1 : 키보드로 부터 숫자를 받아 구구단 출력( 2 ~ 9 까지만 허용)
		
		
//		Scanner abc = new Scanner(System.in);
//		System.out.println("구구단을 입력하세요");
//		int num = abc.nextInt();
//		if(num < 2 || num > 9) {
//			System.out.println("단은 2 ~ 9 사이만 허용");
//			//System.exit(0);
//		}else {
//		for(int count = 1; count < 10 ; count++) {
//				System.out.println(num + " * " + count + "=" + (num * count));
//			}
//		}
//		System.out.println();
//		
//		//문제2 : 1~100 사이의 정수중 3의 배수이면서 5의 배수인 수를 출력하고 그들의 합을 출력
//		int hap = 0;
//		for(int i = 1; i <= 100 ; i++) {
//			if(i % 3 == 0 && i % 5 == 0) {
//				System.out.println(i);
//				hap += i;
//			}
//		}
//		System.out.println("그들의 합은 " + hap);
//		
//		System.out.println();
//		
//		//문제3 : 2 ~ 9 까지 구구단을 출력 (다중 for)
//		System.out.println("구구단 출력");
//		for(int i = 2; i < 10; i++) {
//			for(int j = 1; j < 10; j++) {
//			System.out.print(i + "*" + j + "=" + (i * j) + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		//문제4 : *********
//		//	   *******
//		//	    *****
//		//	     ***
//		// 	      *
//		
//		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print(" ");
//				}
//			for(int k = 10; k > (i*2)+1; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		//문 5 : 문 4 결과 뒤집어서 출력
//		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 4-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k = 0; k < (i*2)+1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//continue, break
		/*
		for(int i = 1; i <= 10; i++) {
			//i = 7; 무한반복루프
			if(i == 3) continue; //continue를 만나는 즉시 밑으로 처리하지않고 바로 for문 상단으로 올라감, 또한 출력도 하지않음
			if(i == 5) break; //break를 만나는 즉시 반복문을 스탑 for 블럭 탈출
			//if(i == 5) return; //메소드를 탈출
			//if(i == 5) System.exit(1); //프로그램 종료
			
			
			
			
			System.out.print(i + " "); 
		}
		
		System.out.println();
		int kk = 0;
		for(;;) { //무한루프
			kk++;
			System.out.println("출력 :  " + kk);
			if (kk == 10) break;
				
		}
		
		
		System.out.println("프로그램 종료");
				
		*/
		
		
	} //return문이 적용되는 구간

}
