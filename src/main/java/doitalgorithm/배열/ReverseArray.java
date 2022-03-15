package doitalgorithm.배열;

import java.util.Scanner;

public class ReverseArray {
	
	static void swap(int[] a, int idx1, int idx2) {
		//배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요소 수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		reverse(x); //배열 a 의 요소를 역순으로 정렬함
		
		System.out.println("요소를 역순으로 정리완료");
		for(int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
		
		
	}
}
