package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12918 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(solution(br.readLine()));
    }

    private static boolean solution(final String s) {
        if (s.length() == 4 || s.length() == 6) {
            return s.matches("^[0-9]*$");
        }
        return false;
    }

}
