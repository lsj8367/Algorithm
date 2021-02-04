package ex02;

public class PrimeNumber3 {
	public static void main(String[] args) {
		int counter = 0; //곱셈,나눗셈의 횟수
		int ptr = 0; //찾은 소수의 개수
		int[] prime = new int[500]; //소수를 저장하는 배열
		
		prime[ptr++] = 2; //2는 소수임
		prime[ptr++] = 3; //3은 소수임
		
		for(int n = 5; n <= 1000; n += 2) { //대상은 홀수만
			boolean flag = false;
			for(int i = 1; prime[i] * prime[i] <= n; i++) {
				counter += 2;
				if(n % prime[i] == 0) { //나누어떨어지면 소수가 아님
					flag = true;
					break;
				}
			}
			if(!flag) {
				prime[ptr++] = n; //소수라고 배열에 저장
				counter++;
			}
		}
		for(int i = 0; i < ptr; i++) {
			System.out.println(prime[i]); //찾은 ptr개의 소수를 출력
		}
		System.out.println("나눗셈 수행횟수 : " + counter);
	}
}
