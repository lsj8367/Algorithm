package 배열;

import java.util.Scanner;

public class Q2 {
	// 배열요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램으로 만들기
	static void search(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	static void swap(int[] a, int idx1, int idx2) {
		//배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]과(와) a[" + (a.length - i - 1 ) + "]를 교환합니다." );
			swap(a, i, a.length - i - 1);
			search(a);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요소 수 입력 : ");
		int a = sc.nextInt();
		
		int[] x = new int[a];
		
		for(int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}
		
		search(x);
		System.out.println();
		reverse(x); //배열 a 의 요소를 역순으로 정렬함		
	}
}
