package 기본;

public class Q5 {
	// 중간값 구하기
	static int med3 (int a, int b, int c) {
		if((b >= a && c <= a) || (b <= a && c >= a)) {
			return a;
		}else if((a > b && c < b) || (a < b && c > b)){
			return b;
		}
		return c;
	}
	// 이렇게 실행하면 똑같은 비교대상을 두번씩 하기 때문에 반복 계산을 처리하여 느려진다.
	
}
