package programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Ex12915 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        solution(new String[]{"sun", "bed", "car"}, n);

    }

    private static void solution(final String[] split, final int n) {
        final String[] answer = Arrays.stream(split).sorted(new Comparator<String>() {
            @Override
            public int compare(final String o1, final String o2) {
                if (o1.charAt(n) > o2.charAt(n)) {
                    return 1;
                }

                if (o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                }

                return -1;
            }
        }).toArray(String[]::new);

        for (String s : answer) {
            System.out.println(s);
        }
    }

}
