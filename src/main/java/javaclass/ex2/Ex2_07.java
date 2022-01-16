package javaclass.ex2;

import java.util.Scanner;

public class Ex2_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int point = 0;
        int sum = 0;

        for (int i : arr) {
            if (i == 1) {
                point++;
                sum += point;
            } else {
                point = 0;
            }
        }

        return sum;
    }

}
