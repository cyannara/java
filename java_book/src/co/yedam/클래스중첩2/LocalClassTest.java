package co.yedam.클래스중첩2;
/**
 * 로컬 클래스
 *  : 맴버 클래스보다도 클래스를 더 깊이 특정 블록 안으로 감추는 효과
 *
 */

//인터페이스 정의
interface Printable {
	void print();
} 

class Papers {
	private String con;
	public Papers(String s) { con = s; }
	public Printable getPrintger() {
/*		class Printer implements Printable {
			public void print() {
				System.out.println(con);
			}		
		}
		return new Printer();*/
		
		return new Printable() {
			public void print() {
				System.out.println(con);
			}	
		};
	}
}


public class LocalClassTest {
	public static void main(String[] args) {
		Papers p = new Papers("서류!!");
		Printable prn = p.getPrintger();
		prn.print();
	}
}
