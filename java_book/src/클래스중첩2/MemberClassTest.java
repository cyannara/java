package 클래스중첩2;

/**
 * inner/맴버 클래스
 *  : 클래스의 정의를 감추어야 할 때 사용 
 *  : 인스턴스 변수와 동일한 위치에 정의
 *  : outer 클래스의 인스턴스 변수에 접근이 가능함.
 *  : outer 인스턴스 생성 없이 inner 인스턴스 생성 불가능
 *
 */
class Emp {
	String employee_id;
	String first_name;
	
	public Emp() {}
	public Emp(String employee_id, String first_name) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
	}

	class Dept {
		String department_id;
		String department_name;
		
		public Dept() {}
		public Dept(String department_id, String department_name) {
			super();
			this.department_id = department_id;
			this.department_name = department_name;
		}

		public String toString(){
			return employee_id +":" + department_id +":"+department_name;
		}
	}
}

class MemberClassTest {
	public static void main(String[] args) {
		Emp emp = new Emp("100","scott");
		Emp.Dept dept = emp.new Dept("10","인사");
		System.out.println(dept.toString());
	}
}