package programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Ex12916 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ss = br.readLine();

        ss = ss.toLowerCase(Locale.ROOT);

        int p = 0;
        int y = 0;

        for (int i = 0; i < ss.length(); i++) {
            if (ss.charAt(i) == 'p') {
                p++;
            } else if (ss.charAt(i) == 'y') {
                y++;
            }
        }

        System.out.println(p == y);
    }

}
