package programmers.str;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class Ex118666 {

    @Test
    void case1Test() {
        final String actual = solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});
        assertThat(actual).isEqualTo("TCMA");
    }

    @Test
    void case2Test() {
        final String actual = solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3});
        assertThat(actual).isEqualTo("RCJA");
    }

    private Map<String, Integer> map;

    private final String[][] types = new String[][]{{"R", "T"}, {"C", "F"}, {"J", "M"}, {"A", "N"}};

    private String answer = "";

    private String solution(String[] survey, int[] choices) {

        map = initMap();

        for (int i = 0; i < survey.length; i++) {
            final String left = survey[i].substring(0, 1);
            final String right = survey[i].substring(1);

            getPoint(left, right, choices[i]);

        }

        for (final String[] type : types) {
            // mbti 각 타입별 값을 비교해서 같으면 알파벳순 아니면 큰값
            answer += addType(map, type[0], type[1]);
        }

        return answer;
    }

    private String addType(final Map<String, Integer> map, final String left, final String right) {
        final Integer leftValue = map.get(left);
        final Integer rightValue = map.get(right);

        if (leftValue < rightValue) {
            return right;
        }

        if (leftValue > rightValue) {
            return left;
        }

        if (left.compareTo(right) < 0) {
            return left;
        }

        return right;
    }

    private Map<String, Integer> initMap() {
        map = new HashMap<>();
        for (String[] type : types) {
            map.put(type[0], 0);
            map.put(type[1], 0);
        }
        return map;
    }

    private void getPoint(final String left, final String right, final int choice) {
        switch (choice) {
            case 1 -> map.put(left, map.getOrDefault(left, 0) + 3);
            case 2 -> map.put(left, map.getOrDefault(left, 0) + 2);
            case 3 -> map.put(left, map.getOrDefault(left, 0) + 1);
            case 5 -> map.put(right, map.getOrDefault(right, 0) + 1);
            case 6 -> map.put(right, map.getOrDefault(right, 0) + 2);
            case 7 -> map.put(right, map.getOrDefault(right, 0) + 3);
            default -> {
            }
        }

//        switch (choice) {
//            case 1:
//                map.put(left, map.getOrDefault(left, 0) + 3);
//                break;
//            case 2:
//                map.put(left, map.getOrDefault(left, 0) + 2);
//                break;
//            case 3:
//                map.put(left, map.getOrDefault(left, 0) + 1);
//                break;
//            case 5:
//                map.put(right, map.getOrDefault(right, 0) + 1);
//                break;
//            case 6:
//                map.put(right, map.getOrDefault(right, 0) + 2);
//                break;
//            case 7:
//                map.put(right, map.getOrDefault(right, 0) + 3);
//                break;
//            default:
//                break;
//        }
    }
}
