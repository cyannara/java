package addressBook;

public class UniversityFriend extends Friend {
	
	public UniversityFriend(String gubun, String name, String tel) {
		super.gubun = gubun;
		super.name = name;
		super.tel = tel;
	}
	
	public String toString() {
		System.out.print("학교명 : " + gubun + "  ");
		System.out.print(name + "  ");
		System.out.println(tel);
		
		return  null;
	}
}
