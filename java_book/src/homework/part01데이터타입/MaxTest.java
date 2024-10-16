package homework.part01데이터타입;

/**
 * 실행결과 : -294867185 
 * 실행결과가 4200100100 로 나오도록 코드 수정
 */
public class MaxTest {
	public static void main(String[] args) {
		int lastYearSales = 2200_100_000;   //error 발생
		int thisYearSales = 1900_000_111;
		
		int totalSales = lastYearSales + thisYearSales;
		System.out.println(totalSales);
	}
}
