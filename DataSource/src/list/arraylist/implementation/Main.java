package list.arraylist.implementation;

public class Main {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		//numbers.add(1, 15);
		//numbers.addFirst(5);
		//System.out.println(numbers.remove(1));
		//System.out.println(numbers.removeLast());
		
		//System.out.println(numbers.get(0));
		
		//System.out.println(numbers.indexOf(20));
		
//		for(int i = 0; i < numbers.size(); i++) {
//			System.out.println(numbers.get(i));
//		}
		
		ArrayList.ListIterator li = numbers.listIterator();
		
		System.out.println(li.next());
		System.out.println(li.next());
		System.out.println(li.next());
		System.out.println(li.next());
	}

}
