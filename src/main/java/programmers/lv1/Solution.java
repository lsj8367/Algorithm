package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];

        for(int i = 0; i < answer.length; i++) {
            int progress = progresses[i];
            int workingTime = 0;

            while (progress < 100) {
                progress += speeds[i];
                workingTime++;
            }
            //7, 3, 9
            answer[i] = workingTime;
        }

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < answer.length; i++) {
            int standard = answer[i];
            int count = 1; //나 자신 처리했으면 1건
            if(standard < 0) continue; //값이 0보다 작으면 다음으로

            for(int j = i + 1; j < answer.length; j++) {
                int compare = answer[j];
                if(standard >= compare) {
                    answer[j] = -1;
                    count++;
                }else{
                    break;
                }
            }

            resultList.add(count);
        }

        answer = resultList.stream().mapToInt(result -> result).toArray();
        return answer;
    }

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        System.out.println(Arrays.toString(solution(progresses, speeds)));
    }
}
