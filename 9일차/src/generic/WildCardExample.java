package generic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import co.java.generic.sample02.Student;

public class WildCardExample {
	public static void main(String[] args) {
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(new Student("홍길동"));
		list1.add(new Student("1"));
		list1.add(new Student("2"));
		list1.add(new Student("3"));
		
		System.out.println(firstThree(list1));
		
	}
	
	public static <T> List<T> firstThree(List<T> list) {
	    return list.stream().limit(3).collect(Collectors.toList());
	}
}
