package doitalgorithm.연습문제.Exercise_2;

public class Ex17 {

	public static void main(String[] args) {
		// 다음 입력 n을 받아 아래와 같은 *을 출력하시오.
		// n : 5;
		// *****
		//  ****
		//   ***
		//    **
		//     *
		int n = 5;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i > j) {
					System.out.print(" ");					
				}else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}
}
