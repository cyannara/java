package middleTest;

public class Book {
	private String isbn;
	private String name;
	private String content;

	public Book() {

	}

	public Book(String isbn, String name, String content) {
		this.isbn = isbn;
		this.name = name;
		this.content = content;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String toString() {
		return "isbn : " + isbn + "\tname : " + name + "\tcontent : " + content;
	}

	public int hashCode() {
		return isbn.hashCode();
	}

	public boolean equals(Object o) {
		Book book = (Book) o;
		if (isbn.compareTo(book.isbn) == 0)
			return true;
		else
			return false;
	}
}
