package programmers.str;

import org.junit.jupiter.api.Test;

import java.util.*;

class Solution {

    @Test
    void test() {
        smallestStringWithSwaps("dacb", List.of(List.of(0, 3), List.of(1, 2)));
    }

    private String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < pairs.size(); i++) {
            graph.add(new ArrayList<>());
        }
        
        for(int i = 0; i < pairs.size(); i++) {
            List<Integer> xy = pairs.get(i);
            graph.get(xy.get(0)).add(xy.get(1));
        }
        return "";
    }
}