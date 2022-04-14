package programmers.lv1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ex92334 {

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, HashSet<String>> reportMap = new HashMap<>();
        Map<String, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            reportMap.put(id_list[i], new HashSet<>());
            indexMap.put(id_list[i], i);
        }

        for (String sentence : report) {
            final String[] nameArr = sentence.split(" ");
            reportMap.get(nameArr[1]).add(nameArr[0]);
        }

        for (int i = 0; i < id_list.length; i++) {
            final HashSet<String> reportCount = reportMap.get(id_list[i]);

            if (reportCount.size() >= k) {
                for (String name : reportCount) {
                    answer[indexMap.get(name)]++;
                }
            }
        }

        return answer;
    }
}
