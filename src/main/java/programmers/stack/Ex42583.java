package programmers.stack;

import java.util.LinkedList;
import java.util.Queue;

public class Ex42583 {

    public int solution(int bridge_length, int weight, int[] truck_weights) {

        // 다리
        Queue<Integer> q = new LinkedList<>();

        int time = 0;
        int sum = 0;

        for (int truck : truck_weights) {

            while (true) {
                if (q.isEmpty()) { // 다리가 비었으면
                    q.offer(truck); // 큐(다리)에 트럭을 넣고
                    sum += truck; // 무게합에 truck 무게를 넣음
                    time++; // 경과시간 +1
                    break;
                } else if (q.size() == bridge_length) { //다리(큐)에 놓을수 있는 트럭갯수가 꽉차면
                    sum -= q.poll(); //합계에서 다리(큐) 맨앞값을 빼줌
                } else {
                    if (sum + truck <= weight) { //앞선 합계 + 다음트럭이 다리무게보다 작거나 같으면
                        q.offer(truck); // 큐에 넣음
                        time++; //시간 +1
                        sum += truck; //합계에 트럭 더함
                        break;
                    } else {
                        q.offer(0); // 0값을 다리에 넣고 옮김
                        time++; //시간 +1
                    }
                }
            }
        }
        // 마지막 트럭이 다리 올라간 상태에서 끝나는데 0 값을 넣고 한번더 로직을 타게된다고 가정하면 다리 길이만큼 더해주어야 한다.
        return time + bridge_length;
    }

}