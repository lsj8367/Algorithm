package programmers.lv1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ex92334 {

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Set<String>> map = new HashMap<>();
        Map<String, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], new HashSet<>());
            resultMap.put(id_list[i], i);
        }

        for (String r : report) {
            final String[] ids = r.split(" ");
            String a = ids[0]; // 이용자 id
            String b = ids[1]; // 신고당한 id

            map.get(b).add(a);
        }

        for (String name : id_list) {
            final Set<String> reportSet = map.get(name);
            if (reportSet.size() >= k) {
                for (String s : reportSet) {
                    answer[resultMap.get(s)]++;
                }
            }
        }

        return answer;
    }
}
