package 인프런.ex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InsertionSort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        final int[] solution = solution(arr);

        for (int value : solution) {
            System.out.print(value + " ");
        }
    }

    private static int[] solution(final int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];

            int prev = i - 1;

            while ((prev >= 0) && (arr[prev] > temp)) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = temp;
        }

        return arr;
    }

}
