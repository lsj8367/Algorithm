package 인프런.ex4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Ex4_03 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> map = new HashMap<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int left = 0;

        for (int right = k - 1; right < n; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            sb.append(map.size()).append(" ");
            map.put(arr[left], map.get(arr[left]) - 1);

            if (map.get(arr[left]) == 0) {
                map.remove(arr[left]);
            }
            left++;
        }

        System.out.println(sb);
    }

}
