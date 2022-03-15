package doitalgorithm.기본;

public class Q13 {
	public static void main(String[] args) {
		// 곱셈표 출력
		
		for(int i = 0; i <= 9; i++) {
			if(i == 0) {
				System.out.print("   |");
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%3d", j);
				}
				System.out.println();
				System.out.println("---+--------------------------");
			}else {
				System.out.printf("%2d |", i);
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%3d", (i + j));
				}
				System.out.println();
			}
		}
	}
}
