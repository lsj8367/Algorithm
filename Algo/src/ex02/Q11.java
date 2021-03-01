package ex02;

public class Q11 {
	int y,m,d; //년 월 일
	public Q11(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	public int after(int n) {
		return d + n; //n일 뒤의 날짜
	}
	
	public int before(int n) {
		return d - n;
	}
	
}
