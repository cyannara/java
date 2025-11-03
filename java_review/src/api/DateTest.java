package api;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		
		String str;
		//Date
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd");
		str = simpleFormatter.format(date);
		System.out.println(str);
		
		//Calendar
		Calendar cal = Calendar.getInstance();
		cal.set(2025, 10, 1);
		System.out.println(cal);
		
		//LocalDate
		LocalDate day;
		day = LocalDate.now();
		System.out.println(day);
		
		day = LocalDate.of(2025, 11, 3);
		System.out.println(day);
		
		day = LocalDate.parse("2025-11-03");
		//day = LocalDate.parse("2025/11/03", formatter);
		System.out.println(day);
		
		ZonedDateTime seoulTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		
		//포맷팅
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		str = day.format(formatter); // "2025/11/03"

		
		//Instant
		Instant instant = Instant.now();
		System.out.println(instant);
		
		//날짜 계산
		
		
	}
}
