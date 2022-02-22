package 인프런.ex7;

import java.util.Arrays;

public class Ex7_03 {

    private static void solution(int[] arr, int n) {
        if (n == 10) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[n] = arr[n - 1] + arr[n - 2];

        n += 1;
        solution(arr, n);
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;

        solution(arr, 2);
    }

}
