package programmers.lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12919 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        final int answer = solution(arr);

        System.out.println("김서방은 " + answer + "에 있다");
    }

    private static int solution(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Kim")) {
                return i;
            }
        }

        return 0;
    }

}
