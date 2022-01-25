package 인프런.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex3_04 {

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

        int count = 0;

//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//
//            for (int j = i; j < n; j++) {
//                sum += arr[j];
//                if (sum == m) {
//                    count++;
//                } else if (sum > m) {
//                    break;
//                }
//            }
//        }
        int left = 0;

        int sum = 0;

        for (int right = 0; right < n; right++) {
            sum += arr[right];
            if (sum == m) {
                count++;
            }
            while (sum >= m) {
                sum -= arr[left];
                left++;

                if (sum == m) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

}
