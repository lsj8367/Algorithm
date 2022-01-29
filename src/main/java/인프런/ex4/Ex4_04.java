package 인프런.ex4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ex4_04 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        char[] arr2 = br.readLine().toCharArray();
        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();

        for (int i = 0; i < arr2.length; i++) {
            secondMap.put(arr2[i], secondMap.getOrDefault(arr2[i], 0) + 1);
        }

        for (int i = 0; i < arr2.length - 1; i++) {
            firstMap.put(arr[i], firstMap.getOrDefault(arr[i], 0) + 1);
        }

        int left = 0;
        int count = 0;

        for (int right = arr2.length - 1; right < arr.length; right++) {
            firstMap.put(arr[right], firstMap.getOrDefault(arr[right], 0) + 1);
            if (firstMap.equals(secondMap)) {
                count++;
            }

            firstMap.put(arr[left], firstMap.get(arr[left]) - 1);
            if (firstMap.get(arr[left]) == 0) {
                firstMap.remove(arr[left]);
            }
            left++;
        }

        System.out.println(count);

    }

}
