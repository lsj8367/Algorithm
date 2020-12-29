package list.linkedlist.implementation;

public class Main {
	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
//		numbers.addFirst(5);
//		System.out.println(numbers.node(0)); 외부에서 사용하지 못하게 해야된다.
//		numbers.add(1, 15);
//		System.out.println(numbers.removeFirst());
		
		System.out.println(numbers.get(0));
		System.out.println(numbers);
		
		
		
	}
}
