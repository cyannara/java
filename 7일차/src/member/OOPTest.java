package member;
/*
 * 다형성
 * 1. 부모타입의 참조변수가 자식 객체를 참조할 수 있다.
 * 2. 실행되는 메서드는 참조하는 객체의 메서드를 호출 (실행결과 다를 수 있다)
 */

import java.util.ArrayList;

public class OOPTest {
	public static void main(String[] args) {

		ArrayList<Member> list = new ArrayList<>();
		Member member;
		
		member = new Prof();
		member.setName("김유신");
		list.add(member);
		
		member = new Emp();
		member.setName("홍길동");
		list.add(member);
		
		for(Member m : list) {
			m.sal();
			m.print();
			if(m instanceof Emp) {
				//객체간의 형변환 부모 자식간에만 가능
				((Emp)m).meth();  //다운캐스팅(형변환)
			}
		}
	}
}
