package 인프런.ex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex6_8 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;
        System.out.println(binarySearch(target, arr, start, end));
    }

    private static int binarySearch(final int target, final int[] arr, int start, int end) {
        while (start <= end) {
            int middle = (start + end) / 2;

            if (target == arr[middle]) {
                return middle + 1;
            } else if (target < arr[middle]) {
                end = middle;
            } else {
                start = middle;
            }
        }
        return 0;
    }

}
