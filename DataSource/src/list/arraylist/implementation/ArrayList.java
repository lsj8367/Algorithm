package list.arraylist.implementation;

public class ArrayList {
	private int size = 0;
	private Object[] elementData = new Object[100];
	
	
	// 맨처음 에 값 추가
	public boolean addFirst(Object element) {
		return add(0, element);
	}
	
	//맨끝에 값 추가
	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}
	
	
	// 넣고싶은 값 추가할때
	public boolean add(int index, Object element) {
		for(int i = size - 1; i >= index; i--) {
			elementData[i + 1] = elementData[i]; // 추가를 하고 원래 값들을 뒤로 하나씩  밀어줌
		}
		elementData[index] = element;
		size++;
		return true;
	}
	
	public String toString() { //toString메소드는 출력시에 문자열로 반환하는 메소드
		String str = "[";
		for(int i = 0; i < size; i++) {
			str += elementData[i];
			if(i < size-1) {
				str += ",";				
			}
		}
		
		return str + "]";
	}
	
	
	
}
