package co.micol.addressBook;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FriendData data = new FriendData();
		//data.selectList();  //전체리스트 출력
		//학교친구만 나오게 만들자
		data.selectUniversity();  //학교친구만 보여준다.
	}

}
