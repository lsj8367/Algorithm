package 연습문제.Exercise;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		//String input = "helloWorlD";
		Scanner sc = new Scanner(System.in);
		System.out.println("대소문자 변환");
		String input = sc.next();
		char[] arr;
		arr = input.toCharArray(); //문자1개씩 array에 담아줌.
		
		for(int i = 0; i < arr.length; i++) { //대문자를 소문자로
			if(65 <= arr[i] && arr[i] <= 90) {
				arr[i] = (char)(arr[i] + 32); //소문자가 대문자보다 아스키코드 값으로 32만큼 크다. 그리고 문자열 덧셈이기 때문에 캐스팅 해줌.
			}else if(97 <= arr[i] && arr[i] <=122){ //소문자를 대문자로
				arr[i] = (char)(arr[i] - 32); //대문자가 소문자보다 아스키코드 값으로 32만큼 작다.
			}else {
				arr[i] = arr[i];
			}
			
		}
		System.out.println(arr);
	}
}
