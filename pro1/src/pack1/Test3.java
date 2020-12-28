package pack1;

public class Test3 {
	public static void main(String[] args) {
		//관계, 논리, 기타
		int a = 5;
		
		System.out.println(a > 3);
		System.out.println(a <= 3);
		System.out.println(a == 3);
		System.out.println(a != 3);
		
		System.out.println();
		int b = 10;
		System.out.println(a > 3 && b <= 10); // and 논리곱
		System.out.println(a > 3 && b == 10);
		System.out.println(a > 20 && b <= 5); //and 연산자지만 첫번째 조건이 거짓이면 두번째 조건은 검사하지 않음.
		System.out.println(a > 20 & b <= 5); //and 연산자지만 양쪽 모두를 체크한다.
		System.out.println(a > 6 || b < 10); //논리합 or
		System.out.println(a > 6 || b < 20); //첫번째가 참이면 그냥 true 출력
		System.out.println(a > 6 | b < 10); //첫 조건이 참 이더라도 두번째 조건을 검사한다.
		System.out.println(a > 6 || b < 20 + 4 * 2); //연산자 우선순위 () > 산술연산자(*,/,% > +,-) > 관계연산자 > 논리연산자 > 치환
		
		System.out.println();
		//shift 연산자
		int ii = 8, ij;
		//System.out.println(ii + " " + ij); //지역변수는 초기화 필수
		System.out.println("ii : " + ii + " " + Integer.toBinaryString(ii));
		ij = ii << 1; //전체 좌로 1 bit 이동시킨다. 밀고 남은 가장 우측 1bit는 0으로 채운다.
		System.out.println("ij : " + ij + " " + Integer.toBinaryString(ij));
		ij = ii >> 2; //전체 우로 2 bit 이동시킨다. 밀고 남은 가장 좌측 2bit는 부호와 같은값으로 채운다.      양수 : 0, 음수 : 1
		System.out.println("ij : " + ij + " " + Integer.toBinaryString(ij));
		ij = ii >>> 2; //전체 우로 2 bit 이동시킨다. 밀고 남은 가장 좌측 2bit는 무조건 0으로 채운다.
		System.out.println("ij : " + ij + " " + Integer.toBinaryString(ij));
		
		System.out.println();
		int result =  (ii <= 5)? 100:100 + 50; //참이면 : 앞조건출력 거짓이면 : 뒤출력
		System.out.println("result : " + result);
		
		System.out.println();
		int x,y,z;
		x = y = z = 5;
		System.out.println(x + " " + y + " " + z);		
		
		System.out.println("====");
		
		System.out.println(bb(12));
		
		int mbc = bb(11);
		System.out.println("mbc : " + mbc);
		System.out.println("프로그램 종료");
		//변수 변수 = 값, 인수(argument parameter)
	}
	
	public static void aa() {
		System.out.println("aa 메소드 (단위 프로그램 : unit) 수행 "); //void aa() 입출력할때 아무것도 안가져오고 안받음.
	}

	public static int bb(int arg) {
		System.out.println("bb 메소드 (단위 프로그램 : unit) 수행 "); //int ## ( int arg) 입출력할때 정수로 들고가서 정수 가져와야함.
		int imsi = arg + 100;
		return imsi;
	}
}
