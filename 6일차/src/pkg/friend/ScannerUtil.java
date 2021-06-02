package pkg.friend;

import java.util.Scanner;

import pkg.Friend;

public class ScannerUtil {
	static Scanner scanner = new Scanner(System.in);
	
	public static int readInt() {
		int result = scanner.nextInt();
		return result;
	}
	public static String readStr() {
		String result = scanner.next();
		return result;
	}	
	public static String readDate() {
		String result = scanner.next();
		return result;
	}	
	public static Friend readFriend(Class<? extends Friend> type) {
		String result = scanner.next();
		String[] arr =  result.split(",");
		if( type == CompanyFriend.class ) {
			CompanyFriend friend = new CompanyFriend();
			friend.gubun = arr[0];
			friend.name = arr[1];
			friend.tel = arr[2];
			friend.duty = arr[3];
			return friend;

		} else if( type == SchoolFriend.class ) {
			SchoolFriend friend = new SchoolFriend();
			friend.gubun = arr[0];
			friend.name = arr[1];
			friend.tel = arr[2];
			friend.birth = arr[2];
			return friend;
		}
		return null;
		
	}		
}
