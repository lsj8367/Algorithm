package javaclass.ex2;

import java.util.Scanner;

public class Ex2_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() + 2;
        int[][] arr = new int[N][N];

        for (int i = 1; i < N - 1; i++) {
            for (int j = 1; j < N - 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arr, N));
    }

    private static int solution(int[][] arr, int N) {
        int count = 0;

        for (int i = 1; i < N - 1; i++) {
            for (int j = 1; j < N - 1; j++) {
                int value = arr[i][j];
                if (value > arr[i - 1][j] && value > arr[i][j - 1] && value > arr[i + 1][j] && value > arr[i][j + 1]) {
                    count++;
                }
            }
        }
        return count;
    }
}
