package method;

public class Calc {
	private int kor;
	private int eng;

	public Calc(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}

	public void add() {
		System.out.println(String.format("%d + %d = %d", 
				                         kor,eng,kor+eng) );
	}
	
	public void printMsg(String msg) {
		System.out.println("====================");
		System.out.println("=======header=======");
		System.out.println("====================");
	}
}
