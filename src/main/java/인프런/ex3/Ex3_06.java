package 인프런.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex3_06 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(k, arr));
    }

    private static int solution(final int k, final int[] arr) {
        int count = 0;
        int left = 0;
        int answer = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                count++;
            }

            while (count > k) {
                if (arr[left] == 0) {
                    count--;
                }

                left++;
            }

            answer = Math.max(answer, right - left + 1);
        }
        return answer;
    }

}
