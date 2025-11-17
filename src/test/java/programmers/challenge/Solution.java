package programmers.challenge;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        
        // 나머지 연산을 했을때 나오는 2가지(토,일)가 index

        int saturdayIndex;
        int sundayIndex;
        if (startday == 7) {
            saturdayIndex = 6;
            sundayIndex = 0;
        } else {
            saturdayIndex = 6 - startday;
            sundayIndex = saturdayIndex + 1;
        }

        int resultCount = 0;
        
        for(int i = 0; i < timelogs.length; i++) {
            // i 는 n번째 사람의 일정
            int schedule = schedules[i];
            int limit = schedule % 100 + 10 >= 60 ? schedule + 50 : schedule + 10;

            boolean isAbsent = false;

            for(int j = 0; j < timelogs[0].length; j++) {
                if (j == saturdayIndex || j == sundayIndex) {
                    continue;
                }

                if (timelogs[i][j] > limit) {
                    isAbsent = true;
                    break;
                }
            }
            if (!isAbsent) {
                resultCount++;
            }
        }
        
        return resultCount;
    }
}