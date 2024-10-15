package day09.innerClass;
/**
 * inner class -> member class :필드 위치 정의된 클래스 
 *
 */
class Outer {
	private int num = 0;
	
	//맴버클래스
	class Member {
		void add(int n) {
			num += n;   //이너클래스에서는 아우터 클래스의필드 접근 가능
		}
		int get() {
			return num;
		}
	}
}

public class MemberInner {
	public static void main(String[] args) {
		Outer o1 = new Outer();
		Outer.Member o1m1 = o1.new Member();
		o1m1.add(10);
		System.out.println( o1m1.get() );
	}
}
