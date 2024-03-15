package day06.api.date;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateTest {

	public static void main(String[] args) {

		LocalDate today =  LocalDate.now();
		System.out.println("오늘은 : " + today);
		
		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		
		Period left = Period.between(today, xmas);
		System.out.println("xmas 까지 남은 일수는 :" 
		                      + left.getMonths() + "개월 "
		                      + left.getDays() + "일");
		
	}
}
