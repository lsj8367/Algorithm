package javaclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1_10 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        String word = arr[0];
        char target = arr[1].charAt(0);

        final int[] results = solution(word, target);

        for (int result : results) {
            System.out.print(result + " ");
        }
    }

    private static int[] solution(String word, char target) {
        int[] result = new int[word.length()];
        int point = 1000;

        for (int i = 0; i < result.length; i++) {
            if (word.charAt(i) == target) {
                point = 0;
            } else {
                point++;
            }
            result[i] = point;
        }

        for (int i = result.length - 1; i >= 0; i--) {
            if (word.charAt(i) == target) {
                point = 0;
                result[i] = 0;
            } else {
                point++;

                if (result[i] > point) {
                    result[i] = point;
                }
            }
        }



        return result;
    }

}
