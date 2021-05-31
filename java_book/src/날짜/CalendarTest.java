import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar ca  = Calendar.getInstance();
		System.out.println( ca.get(Calendar.MONTH)+1 );
		System.out.println( ca.getActualMaximum(Calendar.DAY_OF_MONTH));
		
	}
}
