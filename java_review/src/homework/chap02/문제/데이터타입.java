package work;

/*데이터형
원시타입(Primitive type)
  ■ 불리언 : boolean                  --> Boolean 
  ■ 문자 : char(유니코드, utf-16)       --> Character
  ■ 숫자 
	   정수 : byte, short, int, long  --> Byte, Short, Integer, Long 
	   실수 : float, double           --> Float, Double 

참조타입(Reference type)                    
  ■ 문자열 : String    
  ■ 날짜 : Date, Calendar, 
          LocalTime, LocalDate, LocalDateTime, ZonedDateTime
          Period, Duration
 */
public class 데이터타입 {
	public static void main(String[] args) {

		int score = 90; // 회사평가점수
		double rating = 4.5; // 회사 평점
		long profit = 2_200_000_000l; // 회사 순이익

		boolean mailYn = false;// 이메일 수신여부

		char grade = 'A';// 회사등급
		String name = "예담주식회사"; // 회사명

		System.out.println("score=" + score);
		System.out.println("rating=" + rating);
		System.out.println("profit=" + profit);
		System.out.println("mailYn=" + mailYn);
		System.out.println("grade=" + grade);
		System.out.println("name=" + name);
	}

}
