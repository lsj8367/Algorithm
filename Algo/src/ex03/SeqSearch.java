package ex03;

import java.util.Scanner;

public class SeqSearch {
	//요소수가 n개인 배열 a에서 key와 같은 요소를 선형검색
	static int seqSearch(int[] a, int n, int key) {
		//int i = 0;
		
		/*
		 while(true) {
		 
			if(i == n) {
				return -1; //검색실패 -1반환
			}
			if(a[i] == key) {
				return i; //검색에 성공하여 인덱스를 반환
			}
			i++;
		}
		*/
		
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int num = sc.nextInt();
		int[] x = new int[num]; //길이가 num인 배열
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : "); //키값을 입력
		int ky = sc.nextInt();
		
		int idx = seqSearch(x, num, ky); //배열에서 키값이 ky인 요소를 검색
		
		if(idx == 1) {
			System.out.println("그 값의 요소가 없습니다");
		}else {
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");			
		}
	}
}
