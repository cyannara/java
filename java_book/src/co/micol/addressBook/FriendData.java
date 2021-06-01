package co.micol.addressBook;

public class FriendData {
	private Friend[] friends = new Friend[20];
	
	private void dataInit() {
		friends[0] = new CompanyFriend("한국주식회사", "홍길동", "010-1111-1111");
		friends[1] = new CompanyFriend("한국주식회사", "박기자", "010-1111-1112");
		friends[2] = new UniversityFriend("한국대학교", "홍길순", "010-1111-1113");
		friends[3] = new CompanyFriend("한국주식회사", "김치국", "010-1111-1114");
		friends[4] = new UniversityFriend("한국대학교", "박오름", "010-1112-1111");
		friends[5] = new CompanyFriend("한국주식회사", "김기자", "010-1113-1111");
		friends[6] = new UniversityFriend("미국대학교", "박공부", "010-1114-1111");
		friends[7] = new CompanyFriend("한국주식회사", "최머니", "010-1115-1111");
		friends[8] = new CompanyFriend("한국주식회사", "김과장", "010-1116-1111");
		friends[9] = new CompanyFriend("한국주식회사", "박부장", "010-1111-1117");
		friends[10] = new CompanyFriend("한국주식회사", "홍이사", "010-1117-1117");
		friends[11] = new CompanyFriend("한국주식회사", "김사장", "010-1131-1111");
		friends[12] = new UniversityFriend("미국대학교", "홍공부", "010-1311-1111");
		friends[13] = new UniversityFriend("미국대학교", "최상위", "010-1411-1111");
		friends[14] = new UniversityFriend("한국대학교", "최하위", "010-1151-1111");
		friends[15] = new CompanyFriend("한국주식회사", "김대리", "010-1152-1111");
		friends[16] = new CompanyFriend("한국주식회사", "이사원", "010-1341-1111");
		friends[17] = new CompanyFriend("한국주식회사", "서사원", "010-1351-1111");
		friends[18] = new UniversityFriend("미국대학교", "서공부", "010-1271-1111");
		friends[19] = new CompanyFriend("한국주식회사", "임사원", "010-1911-1111");
	}
	
	public FriendData() {
		dataInit();      //생성될때 데이터set을 구축한다.
	}
	
	public void selectList() {  //전체 데이터 출력
		System.out.println("===========전체 친구 목록 =========");
		for(Friend friend : friends) {
			System.out.print(friend.gubun + " : ");
			System.out.print(friend.name + " : ");
			System.out.println(friend.tel);
		}		
	}
	
	public void selectUniversity() {
//		for(Friend friend : friends) {
//			if(friend.gubun.endsWith("학교")) {
//				System.out.print(friend.gubun + " : ");
//				System.out.print(friend.name + " : ");
//				System.out.println(friend.tel);
//			}
//		}
		
		for(int i = 0; i < friends.length ; i++) {
			if(friends[i].gubun.endsWith("학교")) {
				System.out.print(friends[i].gubun + " : ");
				System.out.print(friends[i].name + " : ");
				System.out.println(friends[i].tel);
			}
		}
	}
}
