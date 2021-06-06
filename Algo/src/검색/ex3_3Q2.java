package 검색;

import java.util.Scanner;

public class ex3_3Q2 {
	public static void main(String[] args) {
		//선형 검색의 스캐닝 과정 상세 출력
		/*   |  0  1  2  3  4  5  6
		---+------------------------
		   |  *
		 0 |  6  4  3  2  1  9  8  
		   |     *
		 1 |  6  4  3  2  1  9  8  
		   |        *
		 2 |  6  4  3  2  1  9  8  
		3는  x[2]에 있습니다.
		
		선형검색 스캐닝 과정대로 * 모양 표시 출력
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 길이 입력");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 배열 요소 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("찾을 요소 입력");
		int searchValue = sc.nextInt();
		
		boolean isExist = isExistedVal(arr, searchValue);
		
		if(isExist) {
			System.out.print("   |");
			for(int i = 0; i < arr.length; i++) {
				System.out.printf("  %d", i);
			}
			System.out.println();
			System.out.println("---+------------------------");
			printArr(arr, searchValue);			
		}else {
			System.out.println("값이 배열에 없습니다.");
		}
		
	}
	
	
	public static void printArr(int[] arr, int searchValue) {
		int index = 0;
		while(index < arr.length) {
			
			
			starLine(index);
			
			
			// 아래가 배열의 n번째 부터 반복해서 출력하는 구간
			System.out.print(" " + index +" |  ");
			for(int arrIndex = 0; arrIndex < arr.length; arrIndex++) {
				System.out.print(arr[arrIndex] + "  "); //배열의 값				
			}
			System.out.println();
			
			if(searchValue == arr[index]) { 
				System.out.println(searchValue + "는  x[" + index + "]에 있습니다.");
				break;
			}

			index++;
		}
	}
	
	// 배열에 값이 있는가 확인 메소드
	static boolean isExistedVal(int[] arr, int searchValue) {
		for(int num: arr) {
			if(num == searchValue) {
				return true;
			}
		}
		return false;
	}
	
	public static void starLine(int index) {
		StringBuffer star = new StringBuffer("  *");
		
		System.out.print("   |"); // 별찍는 1줄
		if (index != 0) {
			for (int i = 1; i <= index; i++) {
				star.insert(0, "   ");
			}
		}
		System.out.print(star);

		System.out.println();
	}
	
}
