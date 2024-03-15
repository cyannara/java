package middleTest;

public interface BookAccess {
	public boolean saveData(Book b);
	public void searchData();
	public boolean deleteData(String id);
}
