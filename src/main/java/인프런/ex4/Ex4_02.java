package 인프런.ex4;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Ex4_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ss = sc.next();
        String ss2 = sc.next();
        final char[] chars = ss.toCharArray();
        final char[] chars2 = ss2.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char aChar : chars) {
            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
        }

        for (char aChar : chars2) {
            map2.put(aChar, map2.getOrDefault(aChar, 0) + 1);
        }

        System.out.println(solution(map, map2));

    }

    private static String solution(final Map<Character, Integer> map, final Map<Character, Integer> map2) {
        for (Character character : map.keySet()) {
            if (!Objects.equals(map.get(character), map2.get(character))) {
                return "NO";
            }
        }
        return "YES";
    }

}
