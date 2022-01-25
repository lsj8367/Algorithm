package 인프런.ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex4_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ss = sc.next();

        char answer = '\n';
        Map<Character, Integer> map = new HashMap<>();

        for (Character spell : ss.toCharArray()) {
            map.put(spell, map.getOrDefault(spell, 0) + 1);
        }

        int max = 0;

        for (Character spell : map.keySet()) {
            if (max < map.get(spell)) {
                max = map.get(spell);
                answer = spell;
            }
        }

        System.out.println(answer);

    }

}
