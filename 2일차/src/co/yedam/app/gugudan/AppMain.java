package co.yedam.app.gugudan;

public class AppMain {
	public static void main(String[] args) {
		GugudanApp gugudan = 
			new GugudanApp();
		gugudan.printDan(3);		
		gugudan.printAll();
		gugudan.printAllReverse();
		gugudan.printRange(3,5);
		
	}

}
