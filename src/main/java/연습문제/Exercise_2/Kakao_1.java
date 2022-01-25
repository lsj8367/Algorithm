package 연습문제.Exercise_2;

public class Kakao_1 {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
//출력	["#####","# # #", "### #", "# ##", "#####"]
		
		for(int i = 0; i < n; i++) {
			int arr = arr1[i] | arr2[i];
			System.out.println(Integer.toBinaryString(arr));
		}
		
		System.out.println();
		
		
		for(int i = 0; i < n; i++) {
			int targetBit = 1;
			String result = "";
			int arr = arr1[i] | arr2[i];
			for(int j = 0; j < n; j++) {
				result = ((arr & targetBit) > 0 ? "#" : " ") + result;
				targetBit = targetBit << 1;
			}
			System.out.println(result);
			
		}
		
		
	}

}
