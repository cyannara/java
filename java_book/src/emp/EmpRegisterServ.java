package emp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeptRegisterServ
 */
@WebServlet("/hr/EmpRegisterServ")
public class EmpRegisterServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 요청파라미터 읽기(분석)
		EmpBeans bean = new EmpBeans();
		bean.setDepartmentId(request.getParameter("departmentId"));
		bean.setManagerId(request.getParameter("managerId"));
		bean.setCommissionPct(request.getParameter("commissionPct"));
		bean.setSalary(request.getParameter("salary"));
		bean.setJobId(request.getParameter("jobId"));
		bean.setHireDate(request.getParameter("hireDate"));
		bean.setPhoneNumber(request.getParameter("phoneNumber"));
		bean.setEmail(request.getParameter("email"));
		bean.setFirstName(request.getParameter("firstName"));
		bean.setLastName(request.getParameter("lastName"));

		//2. 비지니스 로직 처리(Service/DAO 호출 또는 직접처리)
		int result = EmpDAO.getInstance().insert(bean);
		//3. 결과처리
		if(result==0) {
			//등록오류가 난 경우는 에러메시지를 출력하고 등록폼으로
			PrintWriter out = response.getWriter();
			out.print("<script>");
			out.print("alert('emp register error');");
			out.print("history.back();");
			out.print("</script>");
			return;
		}
		//4. view 포워드
		request.getRequestDispatcher("/hr/empList.jsp")
		   .forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
