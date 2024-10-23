package homework.part01.데이터타입;

/**
 * 실행결과 4300100100 이 나오도록 
 * error를 수정하고 
 * 데이터타입을 알맞게 지정하세요
 */
public class MaxTest {
	public static void main(String[] args) {
		int lastYearSales = 2200_100_000;   //error 발생
		int thisYearSales = 2100_000_100;
		
		int totalSales = lastYearSales + thisYearSales;
		System.out.println(totalSales);
	}
}
