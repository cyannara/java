package day06.api.date;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class DateTest2 {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);  
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int day_year = calendar.get(Calendar.DAY_OF_YEAR);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(day_year);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		System.out.println(calendar);
		System.out.println(System.currentTimeMillis());
		
		//살아온 일수 계산

		
		//기념일 계산
		
		
		
		//String -> Date
		
		
		//LocalDate를 이용하여 날짜 조회
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate.getYear() +"/"+
							currentDate.getMonthValue() +"/"+
							currentDate.getDayOfMonth());
		
		//날짜 계산
		System.out.println(currentDate.plusDays(100));
		
		//근무시간 계산
		LocalTime start = LocalTime.of(10, 35, 40);
		LocalTime end = LocalTime.of(18, 36, 50, 800);

		Duration duration = Duration.between(start, end);
		System.out.println("hours: " + duration.toHours());
		System.out.println("Seconds: " + duration.getSeconds());
		System.out.println("Nano Seconds: " + duration.getNano());

	}

}

