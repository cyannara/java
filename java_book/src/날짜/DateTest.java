package 날짜;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// String, Int, date
		Date today = new Date();
		System.out.println(today);
		
		//날짜 format
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(today));
		
		//Calendar
		Calendar c = Calendar.getInstance();
		c.set(2018, 11, 25);
		System.out.println(c);
		System.out.println("day=" + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("month=" + ( c.get(Calendar.MONTH) + 1) );
		
		//남은 일수 계산
		
	}

}
