package 기본;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// n을 입력받고 1 + 2 +... n = 전체합 구하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			//System.out.println(i);
			
			if(i < n) {
				System.out.print(i + "+");
			}else {
				System.out.print(i);
			}
			
			sum += i;
		}
		System.out.println("=" + sum);
	}

}
