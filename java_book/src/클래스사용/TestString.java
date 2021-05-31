package 클래스사용;

public class TestString {

	public static void main(String[] args) {
		
		String a = "    han dang    ";
		String b = new String("kan");
		
		//문자열 길이
		int l = a.length();
		System.out.println("길이 = " + l);
		System.out.println("트림 후 길이 = " 
		                    + a.trim().length());

		//대소문자
		System.out.println(a.toUpperCase());
		
		String c = "good morning";
		System.out.println("인덱스 위치의 글자 : "
		                     +c.charAt(0));
		
		//검색
		System.out.println("글자위치: " 
						+ c.indexOf('o'));  //앞에서
		System.out.println("글자위치: " 
				+ c.lastIndexOf('o'));	//뒤에서
		
		//문자열 부분
		System.out.println(c.substring(5));
		System.out.println(c.substring(0,4));

		//문자열 비교
		String s1 = "lan";
		String s2 = "kan";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
	
	}
}



