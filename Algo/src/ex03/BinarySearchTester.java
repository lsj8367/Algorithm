package ex03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num]; //요솟수가 num인 배열
		
		System.out.println("오름차순으로 입력하세요");
		
		System.out.println("x[0] : "); //배열의 첫 요소를 먼저 입력합니다.
		x[0] = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			} while (x[i] < x[i - 1]); //바로앞의 요소보다 작다면 다시 입력
		}
		
		System.out.print("검색할 값 : "); //키 값을 입력 받음
		int ky = sc.nextInt();
		
		// 검색결과 true이면 인덱스 값 반환
		// false일 경우 해당 인덱스 +1 후 음수로 변환
		int idx = Arrays.binarySearch(x, ky); //베열 x에서 키값이 ky인 요소를 검색
		
		if(idx < 0) System.out.print("그 값의 요소가 없습니다.");
		else System.out.print(ky + "는 x[" + idx + "]에 있습니다.");
		
		
		
		
	}
}
