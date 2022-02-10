package 인프런.ex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lru {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int job = Integer.parseInt(st.nextToken());

        int[] cacheArray = new int[n];
        int[] arr = new int[job];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < job; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int number : arr) {
            int index = -1;

            for (int i = 0; i < cacheArray.length; i++) {
                if (cacheArray[i] == number) {
                    index = i;
                }
            }

            if (index == -1) {
                for (int i = cacheArray.length - 1; i >= 1; i--) {
                    cacheArray[i] = cacheArray[i - 1];
                }
            } else {
                for (int i = index; i >= 1; i--) {
                    cacheArray[i] = cacheArray[i - 1];
                }
            }

            cacheArray[0] = number;

        }

        print(cacheArray);
    }

    private static void print(final int[] cacheArray) {
        for (int answer : cacheArray) {
            System.out.print(answer + " ");
        }
    }

}
