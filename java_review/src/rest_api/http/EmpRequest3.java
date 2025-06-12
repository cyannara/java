package rest_api.http;

import com.google.gson.Gson;

import rest_api.Emp.Emp;
import rest_api.common.MyRequest;

public class EmpRequest3 {
	public static void main(String[] args) {
		
		String strUrl = "http://localhost:81/bank/empList3.jsp";
		String response = MyRequest.get(strUrl);
		
		//gson 
		Gson gson = new Gson();
		Emp emp= gson.fromJson(response, Emp.class);
		System.out.println(emp.getName());


	}
}
