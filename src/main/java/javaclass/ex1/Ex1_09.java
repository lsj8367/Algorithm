package javaclass.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1_09 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }

    private static int solution(final String input) {
        String result = input.replaceAll("[^0-9]", "");
        return Integer.parseInt(result);
    }

}
