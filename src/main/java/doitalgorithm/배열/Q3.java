package doitalgorithm.배열;

import java.util.Scanner;

public class Q3 {
	// 배열 a의 모든 요소의 합계를 구하여 반환하는 메소드
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(sumOf(arr));
		
	}
}
