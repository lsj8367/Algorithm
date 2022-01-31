package programmers;

public class Ex12926 {

    public String solution(final String ss, final int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < ss.length(); i++) {
            char c = ss.charAt(i);

            if (Character.isLowerCase(c)) {
                c = (char) ((c - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(c)) {
                c = (char) ((c - 'A' + n) % 26 + 'A');
            }
            answer.append(c);
        }

        return answer.toString();
    }

}
