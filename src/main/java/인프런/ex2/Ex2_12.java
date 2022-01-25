package 인프런.ex2;

import java.util.Scanner;

public class Ex2_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // n명의 학생수
        int M = sc.nextInt(); //m번의 수학 테스트

        int[][] arr = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arr, N, M));
    }

    private static int solution(final int[][] arr, final int N, final int M) {
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int count = 0;
                for (int k = 0; k < M; k++) {
                    int positionI = 0;
                    int positionJ = 0;
                    for (int l = 0; l < N; l++) {
                        if (arr[k][l] == i) {
                            positionI = l; // l은 등수를 가리킴
                        }

                        if (arr[k][l] == j) {
                            positionJ = l;
                        }
                    }
                    if (positionI < positionJ) {
                        count++;
                    }

                }
                if (count == M) {
                    answer++;
                }
            }
        }

        return answer;
    }

}
