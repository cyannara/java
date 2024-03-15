package day05.co.yedam.bookrent;

public class Member {
	String name;	//이름
	String phone;	//전화번호
	
	//기본생성자
	public Member() {}
	
	//모든 필드를 초기화하는 생성자
	public Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String toString() {
		return "Member [ name=" + name + ", phone=" + phone + "]";
	}

}
