package my.addr;

import java.util.ArrayList;
import java.util.List;
/**
 * 주소록에서 이름 관리
 */
public class AddrList {
	
	List<String> datas;
	
	//datas 초기화
    public AddrList(List<String> datas) {
    	this.datas = datas;
    }
	
	//이름 검색
	public String  searchName(String searchName){
		String searchResult = "";
		for(int i=0; i<datas.size(); i++) {
			if( datas.get(i).equals(searchName)) {
				searchResult = datas.get(i);
			}
		}
		return searchResult;
	}
	
	//성으로 검색
	public List<String>  searchLastName(String searchName){
		
		List<String> searchList = new ArrayList<>();
		for(int i=0; i<datas.size(); i++) {
			if( datas.get(i).startsWith(searchName)) {
				searchList.add(datas.get(i));
			}
		}
		return searchList;
	}
	
	//정렬하기(이름순으로 정렬)
	
}
