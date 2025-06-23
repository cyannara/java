package my.addr;

public class Addr {

	private String name;
	private String tel;
	
	public Addr() {}
	
	//생성자
	public Addr(String name, String tel) {
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
