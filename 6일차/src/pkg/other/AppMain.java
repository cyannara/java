package pkg.other;

import pkg.Car;
import pkg.Count;
import pkg.DateUtil;
import pkg.ProjectInfo;

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
