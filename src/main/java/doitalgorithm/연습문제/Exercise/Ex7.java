package doitalgorithm.연습문제.Exercise;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// 입력된 수가 소수인지 판별하는 방법. (소수는 1로만 나눠짐)
		Scanner sc = new Scanner(System.in);
		
		int num;
		boolean a = true; //소수인지 판별하는 true,false 변수
		
		System.out.println("숫자를 입력하세요.");
		num = sc.nextInt();
		
		
		for(int i = 2; i < num - 1; i++) { //왜 2부터고 -1해주냐면 소수는 1과 자기자신으로만 나눠져야 소수
			if(num % i == 0) { //여기서 0으로 떨어지게하면 false값 줘버리기
				a = false;
			}
		}
		
		if(a == true) {
			System.out.println(num + " 는 소수입니다.");
		}else{
			System.out.println(num + " 는 소수가 아닙니다.");
		}
		
		

	}

}
