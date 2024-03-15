package day06.pkg.friend.util;

import java.util.Scanner;

import day06.pkg.Friend;

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
	public static Friend readFriend() {
		String result = scanner.next();  // 초등 홍길동 1111
		String[] arr =  result.split(" ");
		Friend friend = new Friend(); 
		friend.setGubun( arr[0] );
		friend.setName(arr[1]);
		friend.setTel(arr[2]);
		return friend;
		
	}		
}
