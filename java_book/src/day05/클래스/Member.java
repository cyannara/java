package day05.클래스;

public class Member {
	String id;
	String name;
	String password;
	int age;
	
	//기본생성자
	public Member() {}
	
	//모든 필드를 초기화하는 생성자
	public Member(String id, String name, String password, int age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	
	public Member(String id, String name) {
		this(id,name,"",0);
	}

	//toString
	//@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + "]";
		//return ;
	}

	@Override
	public boolean equals(Object obj) {
		Member s = (Member)obj;
		return this.id.equals(s.id) && this.name.equals(s.name);
	}

	
}
