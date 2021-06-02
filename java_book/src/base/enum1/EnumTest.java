package base.enum1;

/*interface Scale {
	//상수와 추상메서드
	int DO = 0;  //public static final
	int RE = 1;
	int MI = 2;
}*/

enum Scale {
	DO, RE, MI
}

public class EnumTest {
	public static void main(String[] args) {
		Scale sc = Scale.DO;
		switch(sc) {
		case DO : System.out.println("도");break; 
		case RE : System.out.println("레");break; 
		case MI : System.out.println("미");break; 
		}
		
	}
}
