package day05.클래스;

public class SingleToneTest {

	public static void main(String[] args) {
		Calcurator__ c1 = Calcurator__.getInstance();
		//c1 = new Calcurator();
		c1.add(10,20);
		
		Calcurator__ c2 = Calcurator__.getInstance();
		c2.add(10,20);
		
		System.out.println(c1 == c2);
	}

}
