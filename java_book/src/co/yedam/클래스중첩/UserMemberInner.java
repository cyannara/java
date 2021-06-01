package co.yedam.클래스중첩;

/**
 * 목적 : 클래스 정의 감추고 싶을 때
 * 인터페이스  
 *
 */

interface Printable {
	void print();
}
class Papers {
	private String con;
	public Papers(String s) { con = s; }
	
	public Printable getPrinter() {
		/*//2. 로컬 클래스
		class Printer implements Printable {
			public void print() {
				System.out.println(con);
			}		
		}
		return new Printer();*/
		
		//3. 익명클래스 ( 객체생성과 클래스 정의를 한번에 )
		/*return new Printable() {
			public void print() {
				System.out.println(con);
			}
		};*/
		
		//4. 람다식 (java8)  : 추상메서드는 하나만 존재
		Printable prn = () -> {	System.out.println(con); };
		return prn;
	}
	//1. 맴버 클래스
/*	private class Printer implements Printable {
		public void print() {
			System.err.println(con);
		}		
	}*/
}
public class UserMemberInner {
	public static void main(String[] args) {
		Papers p = new Papers("서류 내용...");
		Printable prn = p.getPrinter();
		prn.print();
	}
}
