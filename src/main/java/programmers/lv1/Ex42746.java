package programmers.lv1;

import java.util.Arrays;

public class Ex42746 {

    public String solution(final int[] numbers) {
        String[] result = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(result, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (result[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for (String s : result) {
            sb.append(s);
        }
        return sb.toString();
    }

}
