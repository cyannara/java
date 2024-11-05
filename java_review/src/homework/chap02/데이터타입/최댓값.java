package homework.chap02.데이터타입;

/**
 * 변수에는 표현가능한 범위(최댓값)이 있음
 * 정수형 int  최댓값  2,147,483,647(21억)        - ex) 국어성적
 *      long 최댓값   9,223,372,036,854,775,807 - ex) 대기업 연매출
 * 실행결과 4200000000 이 나오도록 코드를 수정하세요
 * 
 */
public class 최댓값 {
	public static void main(String[] args) {
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		int lastYearSales = 2100_000_000; 
		int thisYearSales = 2100_000_000;
		
		int totalSales = lastYearSales + thisYearSales;
		System.out.println(totalSales);
	}
}
