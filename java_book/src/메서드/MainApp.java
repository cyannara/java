package 메서드;

public class MainApp {
	public static void main(String[] args) {
		
		//consoletest();
		//calctest();
		//mycalctest();
		MyGuessNumber myGuessNumber = 
				          new MyGuessNumber();
		myGuessNumber.start();		
	
	}
	public static void mycalctest() {
		//MyCalc myCalc = new MyCalc();
		int res = MyCalc.sum(10, 30);
		System.out.println(res);
		//뺄셈 테스트
		res = MyCalc.minus(10, 30);
		System.out.println(res);
	}
	
	
	public static void calctest() {
		MyCalculator myCalc = new MyCalculator(10,20);
		System.out.println(myCalc.getResult() );
		
		myCalc = new MyCalculator(100,200);
		System.out.println(myCalc.getResult() );
	}
	
	public static void consoletest() {		
		MyConsole.printline();
		MyConsole.printline(10);
		
		for(int i=0; i<10; i++ ) {
			MyConsole.printline(i,"*");			
		}
	}
	
}
