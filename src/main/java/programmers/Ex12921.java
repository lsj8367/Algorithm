package programmers;

import java.util.Scanner;

public class Ex12921 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(solution(n));
    }

    private static int solution(final int n) {
        boolean[] arr = new boolean[n + 1];
        arr[0] = false;
        arr[1] = false;

        for (int i = 2; i <= n; i++) {
            arr[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(arr.length); i++) {
            if (!arr[i]) {
                continue;
            }

            for (int j = i * i; j < arr.length; j += i) {
                arr[j] = false;
            }
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                count++;
            }
        }

        return count;
    }

}
