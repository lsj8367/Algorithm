package 인프런.ex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex6_10 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, c, arr));

    }

    private static int solution(final int n, final int c, final int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        int left = 1;
        int right = arr[n - 1];

        while (left <= right) {
            int middle = (left + right) / 2;

            if (count(arr, middle) >= c) { //count값이 정한 마릿수와 같다면/
                answer = middle;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return answer;
    }

    private static int count(int[] arr, int middle) {
        int count = 1;
        int endPosition = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - endPosition >= middle) {
                count++;
                endPosition = arr[i];
            }
        }
        return count;
    }

}
