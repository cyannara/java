package 날짜;

import java.time.LocalDate;

public class Dday {

	LocalDate today;
	
	public Dday() {
		this.today = LocalDate.now();
	}
	
	public void plusday(String day) {
		System.out.println(today.plusDays(Long.parseLong(day)));
	}
	
	public static void main(String[] args) {
		Dday dday = new Dday();
		dday.plusday(args[0]);
	}
}


