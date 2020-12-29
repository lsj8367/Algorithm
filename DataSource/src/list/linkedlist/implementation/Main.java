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
//		System.out.println(numbers);
		
		
		LinkedList.ListIterator i = numbers.listIterator();
/*	
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next()); //이 다음 노드는 존재하지 않음.
		System.out.println(i.hasNext());
*/
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
	}
}
