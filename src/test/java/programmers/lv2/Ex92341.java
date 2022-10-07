package programmers.lv2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.junit.jupiter.api.Test;

class Ex92341 {

    @Test
    void test() {
        final int[] solution = solution(new int[]{1, 461, 1, 10}, new String[]{"00:00 1234 IN"});
        for (int i : solution) {
            System.out.println(i);
        }
    }

    private int[] solution(final int[] fees, final String[] records) {
        final int basicTime = fees[0];
        final int basicFee = fees[1];
        final int unitTime = fees[2];
        final int unitFee = fees[3];

        // records 시각, 차량번호, 내역
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> feeMap = new HashMap<>();

        //입출차 정보를 key(차번호): value(시간, in/out) 분류
        for (String record : records) {
            final String[] info = record.split(" ");
            final Integer inTime = calculateTime(info[0]);
            final String carNumber = info[1];
            final String status = info[2];

            if ("OUT".equals(status)) {
                final Integer startTime = map.get(carNumber);
                int useTime = inTime - startTime;

                if (feeMap.containsKey(carNumber)) {
                    feeMap.put(carNumber, feeMap.get(carNumber) + useTime);
                } else {
                    feeMap.put(carNumber, useTime);
                }

                map.remove(carNumber);

            } else {
                map.put(carNumber, inTime);
            }

        }

        for (String carNumber : map.keySet()) {
            final Integer useTime = map.get(carNumber);

            if (feeMap.containsKey(carNumber)) {
                feeMap.put(carNumber, feeMap.get(carNumber) + calculateTime("23:59") - useTime);
            } else {
                feeMap.put(carNumber, calculateTime("23:59") - useTime);
            }
        }

        int[] answer = new int[feeMap.keySet().size()];

        List<Entry<String, Integer>> entry = new ArrayList<>(feeMap.entrySet());

        Collections.sort(entry, Comparator.comparingInt(o -> Integer.parseInt(o.getKey())));

        for (int i = 0; i < entry.size(); i++) {
            if (entry.get(i).getValue() < basicTime) {
                answer[i] = basicFee;
            } else {

                final int remainTime = entry.get(i).getValue() - basicTime;

                //단위시간을 몇번 채웠는지의 몫
                int mulValue = remainTime / unitTime;

                if (remainTime % unitTime > 0) {
                    mulValue++;
                }

                answer[i] = basicFee + (unitFee * mulValue);
            }
        }

        return answer;
    }

    private Integer calculateTime(final String time) {
        final String[] times = time.split(":");
        final Integer hour = Integer.parseInt(times[0]) * 60;
        final Integer minute = Integer.parseInt(times[1]);
        return hour + minute;
    }

}
