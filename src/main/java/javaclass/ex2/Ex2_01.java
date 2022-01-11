package javaclass.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2_01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        System.out.println(solution(arr));
    }

    private static String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();

        sb.append(arr[0]).append(" ");

        for (int i = 0; i < arr.length - 1; i++) {
            if (Integer.parseInt(arr[i]) < Integer.parseInt(arr[i + 1])) {
                sb.append(arr[i + 1]).append(" ");
            }
        }

        return sb.toString();
    }
}
