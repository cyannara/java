package homework.chap02.연산자;

/*
 * 연소득 5,000만 원 이상 또는 신용 등급 B 이상
 */
public class 카드발급조건 {
	public static void main(String[] args) {
		
		int salary = 3000;
		char rating = 'B';
		
		boolean result = salary >=5000 || rating <= 'B';
		
		System.out.println("카드발급여부: " + result);
		
	}
}
