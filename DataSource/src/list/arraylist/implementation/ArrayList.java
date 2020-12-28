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
	
	//배열리스트 값 제거하기
	public Object remove(int index) {
		Object removed = elementData[index];
		for(int i = index + 1; i <= size - 1; i++) {
			elementData[i - 1] = elementData[i]; // 하나씩 자리를 당겨옴(덮어쓰기)
		}
		size--;
		elementData[size] = null; // 맨끝값이 중복되서 삭제해줌
		return removed;
	}
	
	//맨 앞값 지우기
	public Object removeFirst() {
		return remove(0);
	}
	
	//맨 끝값 지우기
	public Object removeLast() {
		return remove(size - 1);
	}
	
	//n번째 값 가져오기
	public Object get(int index) {
		// 장점 : 데이터 처리속도가 빠르다.
		return elementData[index];
	}
	
	public int size() { // arraylist의 크기
		return size;
	}
	
	// 값이 있는지 확인
	public int indexOf(Object o) {
		for(int i = 0; i < size; i++) {
			if(o.equals(elementData[i])) {
				return i; //존재하면 존재하는 index출력	
			}
		}
		return -1; //존재하지 않으면 출력
	}
	
	//메소드의 호출로 객체 생성
	public ListIterator listIterator() {
		return new ListIterator();
	}

	class ListIterator {
		private int nextIndex = 0;
		
		public Object next() {
//			Object returnData = elementData[nextIndex]; 
//			nextIndex++;
//			return returnData;
			
			return elementData[nextIndex++];
		}
		
	}
}
