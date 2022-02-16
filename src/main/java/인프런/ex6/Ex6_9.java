package 인프런.ex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex6_9 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(m, arr));
    }

    private static int solution(final int dvdCount, final int[] arr) {
        int answer = 0;

        int left = Arrays.stream(arr).max().getAsInt();
        int right = Arrays.stream(arr).sum();

        while (left <= right) {
            int middle = (left + right) / 2;
            if (count(arr, middle) <= dvdCount) {
                answer = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return answer;
    }

    private static int count(final int[] arr, int capacity) {
        int count = 1; //dvd의 장 수
        int sum = 0; //dvd 곡들의 합
        for (int x : arr) {
            if (sum + x > capacity) {
                count++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return count;
    }

}
