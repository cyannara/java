package jdbc;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

public class EmployeesDAOTest {

	@Test
	public void testGetEmployees() {
		Employee emp = EmployeesDAO.getInstance().getEmployee("100");
		assertNotNull(emp);
	}

	@Test
	public void testGetEmployeesList() {
		List<Employee> list = EmployeesDAO.getInstance().getEmployeeList();
		assertEquals("Steven", list.get(0).getFirstName());
	}
}
