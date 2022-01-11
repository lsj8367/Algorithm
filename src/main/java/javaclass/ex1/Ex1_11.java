package javaclass.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1_11 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine() + " "));

    }

    private static String solution(String input) {
        StringBuilder sb = new StringBuilder();

        int count = 1;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                sb.append(input.charAt(i));
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }

        return sb.toString();
    }
}
