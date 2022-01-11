package javaclass.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1_01 {

    public static int solution(String inputStr, char spell) {
        int count = 0;

        inputStr = inputStr.toUpperCase();
        spell = Character.toUpperCase(spell);

        for (int i = 0; i < inputStr.length(); i++) {
            if (spell == inputStr.charAt(i)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        char spell = br.readLine().charAt(0);

        System.out.println(solution(inputStr, spell));
    }

}
