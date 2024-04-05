package day02.reperence;

public class StringTest {

	public static void main(String[] args) {
		// TODO String Object test
		String name = "홍길동";  //생성과 동시에 초기화
		String str = new String("index.jsp");  //String str = "컴공"
		
		if(str.equals(name)) {  //if(str == name)
			System.out.println("두 값은 같다.");
		}else {
			System.out.println("두 값은 다르다.");
		}
		
		if(str.endsWith(".jsp")) {
			System.out.println(str);
		}
		
		System.out.println(str.concat("행복"));
	
	}

}
