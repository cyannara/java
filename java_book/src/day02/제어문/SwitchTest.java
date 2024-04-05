package day02.제어문;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO switch ~ case
		int kor = 99;
		String grade;

		switch (kor / 10) {
			case 10:
				grade = "A+";				
				break;
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:          //생략가능하다
				grade = "F";
				break;
		}
		
		 System.out.println(grade);
	 
	}

}
