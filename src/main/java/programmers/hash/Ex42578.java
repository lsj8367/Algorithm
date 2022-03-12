package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Ex42578 {

    public int solution(final String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            final String key = clothes[i][1];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int count = 1;

        for (String s : map.keySet()) {
            count *= map.get(s) + 1;
        }

        return --count;
    }

}
