package ex02;

import java.util.Scanner;

public class Q4 {
	static void copy(int[] a, int[] b) {
		//배열 b의 모든 요소를 배열 a에 복사하는 메소드
		for(int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열 길이 입력");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("배열 " + (i+1) + "번째 값 : ");
			b[i] = sc.nextInt();
		}
		
		copy(a, b);
		
		for(int i = 0; i < b.length; i++) {
			System.out.println(a[i]);
			System.out.println(b[i]);
		}
	}
}
