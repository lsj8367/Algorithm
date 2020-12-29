package list.linkedlist.implementation;

public class Main {
	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
//		numbers.addFirst(30);
//		numbers.addFirst(20);
//		numbers.addFirst(10);
		
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
//		System.out.println(numbers.node(0)); 외부에서 사용하지 못하게 해야된다.
		
		numbers.add(2, 25);
		
		
		
	}
}
