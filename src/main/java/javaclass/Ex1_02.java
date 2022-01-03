package javaclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1_02 {

    public static String solution(char[] charArr) {
        String answer = "";
        for (char c : charArr) {
            if (Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArr = br.readLine().toCharArray();

        System.out.println(solution(charArr));
    }
}
