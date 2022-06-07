package 이코테;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class chapter3_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = 0;

        for (int i = 0; i < n; i++) {
            int minValue = Integer.MAX_VALUE;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                minValue = Math.min(minValue, Integer.parseInt(st.nextToken()));
            }

            result = Math.max(result, minValue);
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
