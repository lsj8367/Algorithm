package doitalgorithm.연습문제.Exercise;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int[] data = {1,2,2,3,1,4,2,2,4,3,5,3,2}; //배열 data
		int[] data = new int[10];
		
		int mode = 0; //최빈값 담아주는것
		
		int[] index = new int[6]; //0~5까지만 담기
		
		int max = Integer.MIN_VALUE; //최대값 담아주는건데 초기값을 최소값으로 줌.
		
		System.out.println("최빈값 구하는 프로그램");
		System.out.println("숫자를 입력하세요. (10개 까지만 가능)");
		
		for(int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
			index[data[i]]++; //data의 i번째 횟수가 1회 증가하는것.
		}
		for(int i = 0; i < index.length; i++) {
			if(max < index[i]) {
				max = index[i];
				mode = i;
			}
		}
		
		System.out.println("최빈값 : " + mode + " 횟수 : " + max + " 번");
	}

}
