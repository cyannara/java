package api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class CalendarWithJavaTime {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("연도를 입력하세요: ");
	        int year = sc.nextInt();
	        System.out.print("월을 입력하세요: ");
	        int month = sc.nextInt();

	        LocalDate firstDay = LocalDate.of(year, month, 1);
	        int lastDay = firstDay.lengthOfMonth();
	        DayOfWeek startDay = firstDay.getDayOfWeek(); // MONDAY, TUESDAY...

	        System.out.println("일\t월\t화\t수\t목\t금\t토");

	        // 첫 주 공백
	        int firstDayOfWeek = startDay.getValue(); // 일요일=0, 월요일=1 ...
	        for (int i = 1; i < firstDayOfWeek; i++) {
	            System.out.print("\t");
	        }

	        // 날짜 출력
	        for (int day = 1; day <= lastDay; day++) {
	            System.out.print(day + "\t");
	            if ((day + firstDayOfWeek) % 7 == 0) {
	                System.out.println();
	            }
	        }
	    }
}
