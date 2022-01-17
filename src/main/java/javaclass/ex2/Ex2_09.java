package javaclass.ex2;

import java.util.Scanner;

public class Ex2_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < N; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < N; j++) {
                sum1 += arr[i][j]; //행의 합
                sum2 += arr[j][i]; //열의 합
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;

        for (int i = 0; i < N; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][N - i - 1];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        System.out.println(answer);

    }
}
