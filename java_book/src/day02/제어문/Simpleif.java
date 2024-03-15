package co.micol.condition;

public class Simpleif {

	public static void main(String[] args) {
		// TODO 단순 if 구문   if(){  };
		int kor = 90;
		String grade = "F";
		
		if(kor >= 90) {
			grade = "A";
		}
		
		System.out.println(grade);
	}

}
