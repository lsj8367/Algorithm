package 스택큐;

public class IntQueue {
    private int max;    // 큐의 용량
    private int front;  // 첫번째 요소 커서
    private int rear;   // 마지막 요소 커서
    private int num;    // 현재 데이터 수
    private int[] que;  // 큐 본체

    // 실행 시 예외 : 큐가 비어 있음
    public class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException(){
        }

        @Override
        public String getMessage() {
            return "큐가 비어있음";
        }
    }

    // 실행 시 예외 : 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException{
        public OverflowIntQueueException() {
        }

        @Override
        public String getMessage() {
            return "큐가 가득 참";
        }
    }

    public IntQueue(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try{
            que = new int[max];      // 큐 본체용 배열 생성
        }catch (OutOfMemoryError e){ // 생성 못할때
            max = 0;
        }
    }

    // 큐에 데이터를 인큐함(넣기)
    public int enque(int x) throws OverflowIntQueueException{
        if(num >= max) throw new OverflowIntQueueException(); // 큐가 가득참

        que[rear++] = x;
        num++;

        if(rear == max) rear = 0;

        return x;
    }

    // 큐에서 데이터를 디큐(꺼냄)
    public int deque() throws EmptyIntQueueException{
        if(num <= 0) throw new EmptyIntQueueException(); //큐가 비었음

        int x = que[front++];
        num--;
        if(front == max) front = 0;

        return x;
    }

    // 큐에서 데이터를 피크(프런트 데이터 조회)
    public int peek() throws EmptyIntQueueException{
        if(num <= 0) throw new EmptyIntQueueException();

        return que[front];
    }

    // 큐에서 x를 검색하여 인덱스(없으면 -1) 반환
    public int indexOf(int x){
        for(int i = 0; i < num; i++){
            int idx = (i + front) % max;
            if(que[idx] == x) //검색 성공시
                return idx;
        }

        return -1; //검색 실패
    }

    // 큐를 비움
    public void clear(){
        num = front = rear = 0;
    }

    // 큐의 용량을 반환
    public int capacity(){
        return max;
    }

    // 큐에 쌓여있는 데이터 수 반환
    public int size(){
        return num;
    }

    // 큐가 비었는지
    public boolean isEmpty(){
        return num <= 0;
    }

    //큐가 가득찼는지
    public boolean isFull(){
        return num >= max;
    }

    //큐 안의 모든 데이터를 front => rear 출력
    public void dump(){
        if(isEmpty()){
            System.out.println("큐가 비었음");
        }else{
            for(int i = 0; i < num; i++){
                System.out.print(que[(i + front) % max] + " ");
            }
            System.out.println();
        }
    }

    // 임의의 데이터 검색
    public int search(int x){
        for(int i = 0; i < num; i++){
            if(que[(i + front) % max] == x)
                return i + 1;
        }
        return 0;
    }
}
