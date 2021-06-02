package co.api.list.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
 * Comparable 인터페이스 
 */
class Car implements Comparable<Car> {
	private String band;
	private int disp;
	public Car() {}
	public Car(int disp) {
		this.disp = disp;
	}	
	public Car(int disp,String band) {
		this.band = band;
		this.disp = disp;
	}
	public String toString() {
		return "Car [disp=" + disp + "]";
	}
	
	@Override
	public int compareTo(Car o) {  //0 : eq  , 음수 : 작다  , 양수 : 크다
		return this.band.compareTo(o.band);
	}	
}

public class SortCar {
	public static void main(String[] args) {
		List<Car> list =  new ArrayList<Car>();
		list.add(new Car(1000,"삼성"));
		list.add(new Car(1200,"현대"));
		list.add(new Car(500,"폭스바겐"));
		list.add(new Car(300,"엘지"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
