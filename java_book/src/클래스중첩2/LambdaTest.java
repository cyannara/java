package 클래스중첩2;
/**
 * 로컬 클래스
 *  : 맴버 클래스보다도 클래스를 더 깊이 특정 블록 안으로 감추는 효과
 *
 */


class PapersLambda {
	private String con;
	public PapersLambda(String s) { con = s; }
	public Printable getPrintger() {
		Printable prn = () -> { System.out.println(con); };
		return prn;
		
/*		class Printer implements Printable {
			public void print() {
				System.out.println(con);
			}		
		}
		return new Printer();*/
		
	}
}


public class LambdaTest {
	public static void main(String[] args) {
		Papers p = new Papers("서류!!");
		Printable prn = p.getPrintger();
		prn.print();
	}
}
