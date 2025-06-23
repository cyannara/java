package my.addr;

import java.util.List;

public class AddrUtil {
	
	public int searchName(List<Addr> list, String name) {
		int result = -1;
		for(int i=0; i< list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				result = i;
				break;
			}
			
		}
		return result;
	}
	
	public int searchTel(List<Addr> list, String tel) {
		int result = -1;
		for(int i=0; i< list.size(); i++) {
			if(list.get(i).getTel().equals(tel)) {
				result = i;
				break;
			}
			
		}
		return result;
	}	
}
