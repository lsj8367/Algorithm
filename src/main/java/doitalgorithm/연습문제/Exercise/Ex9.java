package doitalgorithm.연습문제.Exercise;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		//입력된 수의 각 자릿수의 합을 구하시오.
		
		//int num = 1242; //합은 9가 나와야함.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		int sum = 0; //0으로 초기값 잡아놓고 합계 구하는거.
		
		
//		System.out.println(1242 % 10); // 2 이거를 합에 넣어주고
//		//여기서 num을 124로 만들어
//		System.out.println(124 % 10);  // 4 이걸 또 합에 넣고
//		//여기서 다시 num을 12로 해
//		System.out.println(12 % 10);   // 2 또 합 넣고
//		//여기서 다시 num을 1로 바꾸고
//		System.out.println(1 % 10);    // 1 여기서 합 넣고
//		//끝내
//		System.out.println(1242 / 10);
		String aa = "입력된 수 " + "'" + num + "'";
		
		while(num != 0) {
			sum += (num % 10);
			num = num / 10;
		}
		System.out.println(aa + " 의 각 자릿수 합은 '" + sum + "' 입니다.");
		
		
		
		
	}
}
