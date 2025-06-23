package my;

import java.util.ArrayList;
import java.util.List;

import my.addr.Addr;
import my.addr.AddrCompany;
import my.addr.AddrStudent;

public class Main {
	public static void main(String[] args) {
		List<AddrStudent> list = new ArrayList<>();
		AddrStudent addr1 = new AddrStudent("홍길동", "011-1111");
		list.add(addr1);
		
		AddrCompany addr2 = new AddrCompany("홍길동", "011-1111");
		list.add(addr2);
		
	
		
	}
}
