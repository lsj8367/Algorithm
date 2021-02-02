package ex02;

import java.util.Scanner;

public class Q5 {
	//배열 b의 모든요소를 배열a에 역순으로 복사하는 메서드 rcopy를 작성하세요
	static void rcopy(int[] a, int[] b) {
		for(int i = 0; i < b.length; i++) {
			a[i] = b[b.length - i - 1];
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 길이 입력");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		System.out.println("b배열 입력");
		for(int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		rcopy(a, b); //역으로 변환
		
		for(int x : a) {
			System.out.println(x);
		}
		
		
	}
}
