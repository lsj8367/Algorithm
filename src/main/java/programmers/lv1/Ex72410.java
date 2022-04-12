package programmers.lv1;

public class Ex72410 {

    public String solution(String newId) {
        newId = newId.toLowerCase();
        newId = newId.replaceAll("[^a-z0-9-_.]", "");
        newId = newId.replaceAll("[.]{2,}", ".");

        if (newId.length() > 0 && newId.charAt(0) == '.') {
            newId = newId.substring(1);
        }

        newId = lastIsPoint(newId);

        if (newId.isEmpty()) {
            newId = "a";
        }

        if (newId.length() >= 16) {
            newId = newId.substring(0, 15);
            newId = lastIsPoint(newId);
        }

        if (newId.length() <= 2) {
            char last = newId.charAt(newId.length() - 1);

            while (newId.length() < 3) {
                newId += last;
            }
        }

        return newId;
    }

    private String lastIsPoint(String newId) {
        if (newId.length() > 0 && newId.charAt(newId.length() - 1) == '.') {
            return newId.substring(0, newId.length() - 1);
        }
        return newId;
    }

}
