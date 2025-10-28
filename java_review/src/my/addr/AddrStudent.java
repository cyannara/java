package my.addr;

public class AddrStudent {

	private String name;   //이름
	private String tel;  //전화번호
	
	private String lesson; //학과
	private int grade;  //학년
	
	public AddrStudent() {}
	
	//생성자
	public AddrStudent(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}
