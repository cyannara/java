package co.micol.condition;

public class Comlexif {

	public static void main(String[] args) {
		// TODO if ~ elseif ~ else ;
		int kor = 59;
		String grade = null;
		
		if(kor >= 90) {
			grade = "A";
		}else if(kor >= 80) {
			grade = "B";
		}else if(kor >= 70) {
			grade = "C";
		}else if(kor >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.println(grade);
	}

}
