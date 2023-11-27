package 상속1;

public class TestEmp {
	public static void main(String[] args) {
		//상속과 다형성
		//상속후 메서드를 오버라이딩.
		//1. 부모타입의 참조변수가 자식객체를 참조할 수 있다.
		//2. 참조하는 대상의 메서드들 호출. 실행결과가 다르게 나옴
		Employee e1;			
		e1 = new OfficeEmp("101","홍길동",10000);
		e1.calc();
		System.out.println(e1.toString());		
		e1 = new HourEmp("102","홍길동",5,100);
		e1.calc();
		System.out.println(e1.toString());
		
		Employee[] arr = new Employee[10];
		arr[0] = new OfficeEmp("101","홍길동",10000);
		arr[1] = new HourEmp("101","홍길동",5,100);
 		arr[0].calc();
 		arr[1].calc();
	}
}
