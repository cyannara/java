package lambdaStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamEmpTest {
	public static void main(String[] args) {
		
		List<EmpVO> list = Arrays.asList(new EmpVO("홍길동",100),
				new EmpVO("김기자",50),
				new EmpVO("이순신",150));
		//forEach 출력
		list.stream().forEach(System.out::println);
		
		//이름만 출력 
		Stream<EmpVO> stream = list.stream();
		stream.forEach(emp->System.out.println(emp.getName()));
		
		//급여순 정렬 출력  sort , forEach
		list.stream().sorted((a,b)->b.sal-a.sal).forEach(System.out::println);
		
		//최대급여사원의 이름 min
		Optional<EmpVO> result =list.stream()
				.max(Comparator.comparing(EmpVO::getSal));
				//.orElseThrow(Exception::new)
				//.orElse(EmpVO::new);
		System.out.println("max:" + result.get());

	}
}
