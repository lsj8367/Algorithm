package 인프런.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1_03 {

    public static String solution(String[] input) {
        String answer = "";

        for (int i = 0; i < input.length; i++) {
            if (answer.length() < input[i].length()) {
                answer = input[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        System.out.println(solution(input));
    }
}
