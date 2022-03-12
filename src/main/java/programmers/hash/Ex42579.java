package programmers.hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex42579 {

    public int[] solution(final String[] genres, final int[] plays) {
        List<Music> musicList = new ArrayList<>();
        Map<String, Integer> playCountMap = new HashMap<>();

        for (int i = 0; i < plays.length; i++) {
            musicList.add(new Music(i, genres[i], plays[i]));

            String genre = genres[i];
            playCountMap.put(genre, playCountMap.getOrDefault(genre, 0) + plays[i]);
        }

        List<Entry<String, Integer>> list = new ArrayList<>(playCountMap.entrySet());

        list.sort((o1, o2) -> o2.getValue() - o1.getValue());
        Collections.sort(musicList);

        List<Integer> result = new ArrayList<>();

        for (Entry<String, Integer> entry : list) {
            String genre = entry.getKey();
            int count = 0; //장르별로 2개씩만 넣을 수 있다.
            for (Music music : musicList) {
                if (music.genre.equals(genre) && count < 2) {
                    result.add(music.index);
                    count++;
                }
            }
        }

        return result.stream()
            .mapToInt(i -> i)
            .toArray();
    }

    private static class Music implements Comparable<Music> {

        private int index;
        private String genre;
        private int play;

        public Music(final int index, final String genre, final int play) {
            this.index = index;
            this.genre = genre;
            this.play = play;
        }

        @Override
        public int compareTo(final Music o) {
            if (this.play == o.play) { //재생횟수가 같으면
                return this.index - o.index; // 고유번호 빠른순으로 정렬
            }
            return o.play - this.play; //횟수가 다르면 재생순서 높은순으로 정렬
        }

    }

}
