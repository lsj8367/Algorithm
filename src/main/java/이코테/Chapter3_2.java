package 이코테;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Chapter3_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(greedy(arr, M, K));
    }

    private static int greedy(final int[] arr, int M, int K) {
        Arrays.sort(arr);

        int lastNumber = arr.length;

        int first = arr[lastNumber - 1];
        int second = arr[lastNumber - 2];

        int result = 0;

        while (true) {
            for (int i = 0; i < K; i++) {
                if (M == 0) {
                    break;
                }
                result += first;
                M -= 1;
            }
            if (M == 0) {
                break;
            }
            result += second;
            M -= 1;
        }

        return result;
    }

}
