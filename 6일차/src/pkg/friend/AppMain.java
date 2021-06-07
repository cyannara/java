package pkg.friend;

import pkg.Friend;
import pkg.friend.util.ScannerUtil;

public class AppMain {
	public static void main(String[] args) {
		
		FriendList manager = new FriendList();
		Friend f = ScannerUtil.readFriend();
		manager.insert(f);
		
		for( Friend fr : manager.friends ) {  
				fr.print();
		}
	}
}
