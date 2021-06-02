package pkg.friend;

import pkg.Friend;

public class SchoolFriend extends  Friend {
	String birth;
	
	public SchoolFriend() {}
	
	public SchoolFriend(String gubun, String name, String tel) {
		super(gubun, name, tel);
	}

	public SchoolFriend(String gubun, String name, String tel, String birth) {
		super(gubun, name, tel);
		this.birth = birth;
	}

	@Override
	public void print() {
		//super.print();
		//System.out.println("생일: " + birth);
		System.out.printf("학교친구: %20s %20s %20s %20s\n", gubun, name, tel, birth);
	}
	
	
}
