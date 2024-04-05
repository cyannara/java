package 자바보강.middleTest;

public interface BookAccess {
	public boolean saveData(Book b);
	public void searchData();
	public boolean deleteData(String id);
}
