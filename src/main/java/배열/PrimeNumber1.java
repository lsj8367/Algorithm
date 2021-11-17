package 배열;

public class PrimeNumber1 {
	public static void main(String[] args) {
		//1000 이하의 소수를 나열하는 프로그램
		int counter = 0; //나눗셈의 횟수
		
		for(int n = 2; n <= 1000; n++) {
			int i;
			for(i = 2; i < n; i++) {
				counter++;
				if(n % i == 0) //나누어떨어지면 소수가 아님
					break; //반복 중단
			}
			if(n == i) { //마지막까지 나누어떨어지지 않음
				System.out.println(n);
			}
		}
		System.out.println("나눗셈 횟수 : " + counter);
	}
}
