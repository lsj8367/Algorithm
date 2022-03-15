package doitalgorithm.검색;

import java.util.Scanner;

public class SeqSearchSen {
	//선형검색(보초법)
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;
		
		while(true) {
			if(a[i] == key) { //검색성공조건
				break;
			}
			i++;
		}
		return i == n ? -1 : i;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수");
		int num = sc.nextInt();
		int[] x = new int[num + 1];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int idx = seqSearchSen(x, num, key);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
		}
	}
}
