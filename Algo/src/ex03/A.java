package ex03;

public class A implements Comparable<A>{
	
	// 필드, 메소드 등
	
	@Override
	public int compareTo(A c) {
		// this가 c보다 크면 양의 값 반환
		// this가 c보다 작으면 음의 값 반환
		// this가 c와 같으면 0 반환
		
		
		return 0;
	}
	
	@Override
	public boolean equals(Object c) {
		// this가 c와 같으면 true 반환
		// this가 c와 같지 않으면 false 반환
		
		
		
		return false;
	}
}
