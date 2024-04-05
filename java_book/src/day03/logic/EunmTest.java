package day03.logic;

public class EunmTest {
	
	public enum Week {   //eunm type define
		Mon,Tue,Wde,Thu,Fri,Sat,Sun
	}

	public static void main(String[] args) {
		// TODO enum test
		Week toDay = null;   //stack memory에만 변수를 활당했음
		toDay = Week.Tue;
		System.out.println(toDay);
		int[] num = null;
		num = new int[6];  //heap 메모리 공간 확보
		num[0] = 1;
		System.out.println(num[0]);
		
	}
}
