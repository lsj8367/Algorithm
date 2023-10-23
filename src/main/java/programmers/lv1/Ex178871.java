package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class Ex178871 {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playersMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            playersMap.put(players[i], i);
        }

        for (String calling : callings) {
            final Integer grade = playersMap.get(calling);
            String front = players[grade - 1];

            //swap
            players[grade - 1] = calling;
            playersMap.put(calling, grade - 1);

            players[grade] = front;
            playersMap.put(front, grade);
        }

        return players;
    }

}
