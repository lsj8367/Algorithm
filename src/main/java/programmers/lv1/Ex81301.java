package programmers.lv1;

public class Ex81301 {

    public int solution(String s) {
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers.length; i++) {
            s = s.replaceAll(words[i], numbers[i]);
        }

        return Integer.parseInt(s);
    }

}
