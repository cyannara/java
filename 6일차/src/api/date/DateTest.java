package api.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		
		// Date
		Date today = new Date();
		System.out.println(today);
		
		//날짜 format
		//Date  --> String 
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String strToday = df.format(today);
		System.out.println(strToday);
		
		//String --> Date
		
		
		//Calendar
		Calendar c = Calendar.getInstance();
		c.set(2018, 11, 25);
		System.out.println(c);
		System.out.println("day=" + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("month=" + ( c.get(Calendar.MONTH) + 1) );
		
		//날짜 계산
		
		
		//현재날짜와 시간 조회
		
	}

}
