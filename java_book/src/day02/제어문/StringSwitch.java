package day02.제어문;

public class StringSwitch {

	public static void main(String[] args) {
		// TODO 문자열 case문
		String key = "C";
		
		switch (key) {
			case "A":
				System.out.println("90 ~ 100점사이");
				break;
			case "B":
				System.out.println("80 ~ 89점사이");
				break;
			case "C":
				System.out.println("70 ~ 79점사이");
				break;
			case "D":
				System.out.println("60 ~ 69점사이");
				break;
			case "F":
				System.out.println("59점 이하");
				break;
		}

	}

}
