package javaclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1_08 {

    private static String solution(String input) {
        input = input.toUpperCase().replaceAll("[^A-Z]", "");
        StringBuilder sb = new StringBuilder(input);
        if (input.equals(sb.reverse().toString())) {
            return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }
}
