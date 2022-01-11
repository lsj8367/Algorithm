package javaclass.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1_07 {

    public static String solution(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        input = input.toUpperCase();
        System.out.println(solution(input));
        //내풀이
//        int count = 0;
//
//        int left = 0;
//        int right = input.length() - 1;
//        char[] arr = input.toCharArray();
//        for (int i = 0; i < input.length(); i++) {
//            if (arr[left] == arr[right]) {
//                left++;
//                right--;
//                count++;
//            } else {
//                System.out.println("NO");
//                break;
//            }
//
//            if (count == input.length() / 2) {
//                System.out.println("YES");
//            }
//        }

    }
}
