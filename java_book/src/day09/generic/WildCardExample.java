package day09.generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Function;


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
	
	
	public static  List<Student> firstfour(List<Student> list) {
		
	       List<Student> sortedList = list.stream() 
	    		   .sorted(new Comparator<Student>() {                         //익명클래스
	    			    @Override
	    			    public int compare(Student s1, Student s2) {
	    			        return s1.getName().compareTo(s2.getName());
	    			    }
	    			})
	    		   //  .sorted( (Student o1, Student o2)-> o1.getName().compareTo(o2.getName() )  )  //람다식으로 직접 compare()를 구현
	             //    .sorted(Comparator.comparing((Student s) -> s.getName()))   //static method
	    		  // .sorted(Comparator.comparing(Student::getName))               //메서드 참조(더블콜론- 람다표현식 축약문법)
	                .collect(Collectors.toList());
	       return sortedList;
	}
}
