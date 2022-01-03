package javaclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1_02 {

    public static void solution(char[] charArr) {
        for (int i = 0; i < charArr.length; i++) {
            if (Character.isLowerCase(charArr[i])) {
                charArr[i] = Character.toUpperCase(charArr[i]);
            } else if (Character.isUpperCase(charArr[i])) {
                charArr[i] = Character.toLowerCase(charArr[i]);
            }
        }
        for (int i = 0; i < charArr.length; i++) {
            System.out.print(charArr[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArr = br.readLine().toCharArray();

        solution(charArr);
    }
}
