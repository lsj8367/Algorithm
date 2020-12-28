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
//		while(li.hasNext()) {//true 했을시 최대크기 이후가 되면 error 발생.
//			System.out.println(li.next());
//		}
		
//		while(li.hasPrevious()) {
//			System.out.println(li.previous());
//		}
		
		//li.remove(); // 바로 실행할 순 없다. next로 인덱스 이동을 안해줬기 때문.
		
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number == 30) {
				//li.add(35);
				li.remove();
			}
		}
		
		System.out.println(numbers);
		
		
		
		
	}
}
