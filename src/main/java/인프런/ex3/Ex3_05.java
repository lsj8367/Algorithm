package 인프런.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3_05 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[(n / 2) + 1];

        int value = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
            value++;
        }

        int left = 0;
        int count = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            if (sum == n) {
                count++;
            }

            while (sum >= n) {
                sum -= arr[left];
                left++;

                if (sum == n) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }

}
