package rest_api.http;

import com.google.gson.Gson;

import Emp.Emp;
import Emp.EmpList;
import common.MyRequest;

public class EmpRequest2 {
	public static void main(String[] args) {
		
		String strUrl = "http://localhost:81/bank/empList2.jsp";
		String response = MyRequest.get(strUrl);
		
		Gson gson = new Gson();
		Emp[] empList = gson.fromJson(response, Emp[].class);
		for(Emp emp : empList) {
			System.out.println(emp.getName());
		}
	}
}
