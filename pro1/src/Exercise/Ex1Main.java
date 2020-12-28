package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

import Exercise.Ex1;

public class Ex1Main {

	public static void main(String[] args) {
		Ex1 st1 = new Ex1("홍길동", "1");
		Ex1 st2 = new Ex1("가나다", "2");
		Ex1 st3 = new Ex1("아무개", "3");

		ArrayList<Ex1> list = new ArrayList<Ex1>();

		list.add(st1);
		list.add(st2);
		list.add(st3);

		for (Ex1 s : list) {
			System.out.println(s.getName());
			System.out.println(s.getNo());
		}
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("계속할거면 y, 종료할거면 n");
			String aa = sc.next();
			
			if(aa.equals("y")) {
				System.out.println("검색할 학생을 입력하세요.");
				String name = sc.next();
				boolean a = false;
				for(Ex1 s:list) {
					if(s.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은 : " + s.getNo());
						a = true;
					}
				}
				if(!a) {
					System.out.println("그런 학생이름은 없습니다.");
				}
				
				
				
			}else if(aa.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("y와n만 입력이 가능.");
			}
		}
		
		
		
		
	}

}
