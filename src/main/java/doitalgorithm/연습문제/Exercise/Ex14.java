package doitalgorithm.연습문제.Exercise;

public class Ex14 {
	public static void main(String[] args) {
		//입력된 숫자의 개수를 출력하는 프로그램
		// 0 ~ 9 까지 나온 총 갯수
		
		int a = 92712312;
		
		int[] arr = new int[10]; //0 ~ 9를 카운트 하기 위한 배열
		
		while (a > 0) {
			arr[a % 10]++; //5에 해당하는값 1올림
			a /= 10;
		}
		
		 
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + " : " + arr[i] + "개");
		}
		
	}
}
