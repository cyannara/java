package innerClass;

/**
 * inner/�ɹ� Ŭ����
 *  : Ŭ������ ���Ǹ� ���߾�� �� �� ��� 
 *  : �ν��Ͻ� ������ ������ ��ġ�� ����
 *  : outer Ŭ������ �ν��Ͻ� ������ ������ ������.
 *  : outer �ν��Ͻ� ���� ���� inner �ν��Ͻ� ���� �Ұ���
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
		Emp.Dept dept = emp.new Dept("10","�λ�");
		System.out.println(dept.toString());
	}
}