package 인프런.ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Ex5_07 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ss = br.readLine();
        String ss2 = br.readLine();

        System.out.println(solution(ss, ss2));
    }

    private static String solution(final String ss, final String ss2) {

        Queue<Character> q = new LinkedList<>();

        for (char ch : ss.toCharArray()) {
            q.offer(ch);
        }

        for (char ch : ss2.toCharArray()) {
            if (q.contains(ch)) {
                if (q.poll() != ch) {
                    return "NO";
                }
            }
        }

        if (q.isEmpty()) {
            return "YES";
        }

        return "NO";
    }

}
