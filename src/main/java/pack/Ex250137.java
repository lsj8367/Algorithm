package pack;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Ex250137 {

    public static void main(String[] args) {
        final Ex250137 ex = new Ex250137();
        System.out.println(ex.solution(new int[]{5, 1, 5}, 30, new int[][]{{2, 10}, {9, 15}, {10, 5}, {11, 5}}));
        System.out.println(ex.solution(new int[]{3, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}}));
        System.out.println(ex.solution(new int[]{4, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}}));
        System.out.println(ex.solution(new int[]{1, 1, 1}, 5, new int[][]{{1, 2}, {3, 2}}));
        System.out.println(ex.solution(new int[]{2, 1, 3}, 20, new int[][]{{1, 15}, {6, 2}}));
    }

    public int solution(int[] bandage, int health, int[][] attacks) {
        int copiedHealth = health;
        int seconds = bandage[0];
        int heal = bandage[1];
        int addedHeal = bandage[2];
        Map<Integer, Integer> damageInfo = new HashMap<>();
        int endTurn = 0;
        for(int i = 0; i < attacks.length; i++) {
            final int[] attack = attacks[i];
            damageInfo.put(attack[0], attack[1]);
            endTurn = attack[0];
        }

        int time = 0;

        for (int i = 1; i <= endTurn; i++) {
            if (damageInfo.containsKey(i)) {
                copiedHealth -= damageInfo.get(i);
                time = 0;
            } else {
                copiedHealth += heal;
                time++;

                if (time == seconds) {
                    copiedHealth += addedHeal;
                    time = 0;
                }

                if (copiedHealth > health) {
                    copiedHealth = health;
                }
            }

            if (copiedHealth <= 0) {
                return -1;
            }

        }

        return copiedHealth;
    }

}
