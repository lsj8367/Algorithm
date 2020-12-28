package pack1;

import java.util.Scanner;

public class Test7while {
	public static void main(String[] args) {
		// 반복문 while(조건){} 조건이 참인것만
		/*int w = 1;
		while(w <= 5) {
			System.out.println("w : " + w);
			w++; //반복문 탈출을 위한 작업 필수
		}
		System.out.println("탈출 후 w :" + w);
		
		System.out.println();
		w = 0;
		while(true) { //무한반복
			w++;
			if(w == 2) continue;
			if(w == 5) break;
			System.out.println("w: " + w);
		}
		
		System.out.println();
		w = 10;
		do {
			System.out.println("더블유 : " + w);
			w++;
		}while(w <= 5);
		*/
		//문1) 1 ~ 100 사이의 숫자 중 3의 배수이나 2의 배수가 아닌 수를 출력하고, 그 합과 건수를 출력.
		
		int aa = 1, sum = 0;
		int n = 0;
		while (aa <= 100) {
			if(aa % 3 == 0 && aa % 2 != 0) {
				System.out.println(aa);
				sum += aa;
				n += 1;
			}
			aa++;
		}
		System.out.println("합 :" + sum);
		System.out.println("건수 :" + n);
		
		System.out.println();
		
		//문2) -1, 3, -5, 7, -9, 11, ~ 99까지의 합?
		int a = 3; //-97 + 99 제한
		int b = -1;
		int hab = 0;
		int x = 0;
		while(a > -97) {
			a = a - 4;
			System.out.println(a);
			hab += a;
		}
		System.out.println(hab);
		while(b < 99) {
				b = b + 4;
				System.out.println(b);
				x += b;
		}
		System.out.println(x);
		System.out.println("99까지 양,음 홀수의 합 :" + (hab+x));
		
		//문3) 키보드로 숫자 입력 : 5
		//    5까지의 합 출력
		//    계속할까요?(1/0)      <= 1이면 계속, 0이면 작업 끝
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			int y = 0; //합 누적
			int z = 1; 
			
			System.out.println("숫자를 입력하세요.");
			int aaa = sc.nextInt();
			
			while(z <= aaa) {
				y += z;
				z++;
				}
			
			System.out.println(aaa + "까지의 합 : " + y );
			System.out.print("계속하시겠습니까?");
			int bbb = sc.nextInt();
			
			if(bbb == 1)
				continue;
			else if(bbb == 0) {
				System.out.println("끝");
				break;
			}
			else { 
				System.out.println("0과 1만 입력이 가능합니다.");
				//System.exit(0);
				continue;
			}
		}										
	}
}
