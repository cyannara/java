package co.yedam.app.bookrent.complete;

public class Rent {
	String name;	//대여회원
	String title;	//대여도서
	String date;	//대여일자
	
	public Rent() {}
	
	public Rent(String name, String title) {
		this(name, title, "20210601");
	}
	
	public Rent(String name, String title, String date) {
		super();
		this.name = name;
		this.title = title;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	@Override
	public String toString() {
		return "Rent [name=" + name + ", title=" + title + ", date=" + date + "]";
	}
	
}
