package day05.클래스;


public class Calcurator__ {

	//싱글톤
	private static Calcurator__ instance = new Calcurator__();
	public static Calcurator__ getInstance() {
		return instance;
	}
	private Calcurator__() {}
	public int add(int a, int b) {
		return a+b;
	}
	
}
