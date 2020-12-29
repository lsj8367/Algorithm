package list.linkedlist.implementation;

public class LinkedList {
	private Node head; //제일 앞에있는 정보
	private Node tail; //제일 끝에있는 정보
	private int size = 0; //리스트의 크기
	
	private class Node{ // 내부클래스
		private Object data; //데이터들
		private Node next; //다음 노드에대한 정보
		public Node(Object input) { //값을 매개변수로 넣어줌
			this.data = input; //데이터로 넣어줌
			this.next = null; //next정보를 알수 없기에 null
		}
		
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	public void addFirst(Object input) {
		Node newNode = new Node(input); //Node클래스 객체화
		newNode.next = head; //새로만들어진 next값으로 이전에 만들었던 head를 참조하여 이전 Node 가리킴
		head = newNode;
		size++; //리스트에 추가했기 때문에 값 추가
		if(head.next == null) { // 노드의 갯수가 1개라면
			tail = head;
		}
	}
	
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if(size == 0) { //데이터가 완전 없는 상태라면 결국 똑같은 곳이기 때문.
			addFirst(input);
		}else {
			tail.next = newNode; //끝부분 뒤값 새노드를 가리키고
			tail = newNode; // tail값을 새로운노드로 갱신해줌
			size++; //그러면서 크기를 1늘려줌
			
		}	
	}
	
	//조회하는 메소드
	Node node(int index) { 
		Node x = head;
		for(int i = 0; i < index; i++) {
			x = x.next; //계속 다음값을 호출			
		}
		return x;
	}
	
	//추가 메소드
	public void add(int k, Object input) {
		if(k == 0) {
			addFirst(input);
		}else {
			Node temp1 = node(k-1); //k번째 이전 값(주소) 알게됨
			Node temp2 = temp1.next; //k번째 값
			Node newNode = new Node(input);
			
			temp1.next = newNode; // temp1에서 새노드로 다리를 이어줌
			newNode.next = temp2; // 새노드 다음을 원래의 temp1.next로 이어줌
			size++;
			if(newNode.next == null) {
				tail = newNode;
			}
		}
	}
	
	//문자열 반환 println
	public String toString() {
		if(head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";
		
		while(temp.next != null) { //리스트 길이가 null이 아니면
			str += temp.data + ", "; //그 인덱스의 값, 를 이어줌
			temp = temp.next; //다음값으로 바꿈
		}
		str += temp.data;
		
		return str + "]";
	}
	
	//첫번째 값 지우기
	public Object removeFirst() {
		Node temp = head; //head값을  temp Node에 저장을 한다.
		head = head.next; //head를 다음값으로 바꿔줌
		Object returnData = temp.data; //삭제할값의 데이터를 돌려주고
		temp = null; //temp를 비움
		size--;
		
		return returnData;
	}
	
	//삭제하기
	public Object remove(int k) {
		if(k == 0) {
			return removeFirst();
		}
		Node temp = node(k - 1); // 해당하는 것의 이전 주소를 알아냄
		Node todoDeleted = temp.next; //삭제하려는 노드
		temp.next = temp.next.next;
		Object returnData = todoDeleted.data;
		
		if(todoDeleted == tail) { //삭제하는게 끝값이라면
			tail = temp;
		}
		todoDeleted = null;
		size--;
		return returnData;
	}
	
	//끝값 삭제
	public Object removeLast() {
		return remove(size-1);
	}
	
	//LinkedList의 크기 조회
	public int size() {
		return size;
	}
	
	// value값 출력
	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}
	
	//index번호 찾기
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;
		while(temp.data != data) {
			temp = temp.next;
			index++;
			if(temp == null) {
				return -1; //검색 끝에 도달해도 없다면
			}
		}
		return index;
	}
	
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	
	public class ListIterator{
		private Node next;
		private Node lastReturned;
		private int nextIndex;
		
		ListIterator(){
			next = head; // next변수 head초기화
		}
		// 다음값 출력
		public Object next() {
			lastReturned = next; //현재 노드가 lastReturned에 기록
			next = next.next; //현재의 다음노드로 바꿈
			nextIndex++;
			
			return lastReturned.data;
		}
		
		// 다음값이 있는지 확인
		public boolean hasNext() {
			return nextIndex < size(); //size와 nextIndex가 같으면 null도 출력되기 때문에 작을때만 True
		}
		
		
		
		
		
		
	}
	
	
	
	
}
