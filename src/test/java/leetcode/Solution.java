package leetcode;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class Solution {
    //I             1
    //V             5
    //X             10
    //L             50
    //C             100
    //D             500
    //M             1000
    private int romanToInt(String s) {

        Map<String, Integer> romansMap = new HashMap<>();
        romansMap.put("I", 1);
        romansMap.put("V", 5);
        romansMap.put("X", 10);
        romansMap.put("L", 50);
        romansMap.put("C", 100);
        romansMap.put("D", 500);
        romansMap.put("M", 1_000);

        String[] romanStrings = s.split("");

        int prevValue = 0;
        int total = 0;

        for (int i = romanStrings.length - 1; i >= 0; i--) {
            String romanString = romanStrings[i];
            int currentValue = romansMap.get(romanString);

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }

        return total;
    }

    @Test
    void test1() {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));
    }


}