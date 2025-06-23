package my.addr;

public class AddrCompany  implements Printable{
	
	private String name;
	private String tel;
	private String companyName; 
	private String position;  //직위
	public AddrCompany(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	@Override
	public void print() {
		System.out.println(name +  ":" + tel +":" + ":" + companyName);
	}
	
	
}
