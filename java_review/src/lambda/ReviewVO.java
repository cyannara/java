package lambda;

public class ReviewVO {
	String name;
	String content;
	
	public ReviewVO() {}
	public ReviewVO(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getContent() {
		return content;
	}
	void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "ReviewVO [name=" + name + ", content=" + content + "]";
	}
	
}
