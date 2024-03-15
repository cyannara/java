package day06.pkg.other;

import day06.pkg.Car;
import day06.pkg.Count;
import day06.pkg.DateUtil;
import day06.pkg.ProjectInfo;

public class AppMain {
	public static void main(String[] args) {
		Car car = new Car();
		car.setModel("현대");
		car.setSpeed(100);		
		Car car2 = new Car("삼성",50);
		Car car3 = new Car("삼성");
		
		System.out.println(DateUtil.curDate());
		System.out.println(ProjectInfo.name);
		
		Count count1 = new Count();
		Count.cnt1++;
		count1.setCnt2( count1.getCnt2() + 1 ); 
	}
}
