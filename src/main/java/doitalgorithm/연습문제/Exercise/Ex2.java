package doitalgorithm.연습문제.Exercise;

public class Ex2 {
	public int an, a, b;

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		
		//An = An-1 + An-2 n >= 3
		// a = 1, b = 1;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = arr[1] + arr[2];
		
		for(int i = 3; i < 100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for(int i = 1; i <= 20; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}

}
