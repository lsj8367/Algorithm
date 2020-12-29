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
	
	Node node(int index) { //조회하는 메소드
		Node x = head;
		for(int i = 0; i < index; i++) {
			x = x.next; //계속 다음값을 호출			
		}
		return x;
	}
	
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
	
	
}
