package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Ex42577 {

    public boolean solution(String[] phoneBook) {
        Map<String, Integer> map = new HashMap<>();

        for (String phone : phoneBook) {
            map.put(phone, 1);
        }

        for (int i = 0; i < phoneBook.length; i++) {
            for (int j = 0; j < phoneBook[i].length(); j++) {
                if (map.containsKey(phoneBook[i].substring(0, j))) {
                    return false;
                }
            }
        }
        return true;
    }

}
