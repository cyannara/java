package rest_api.http;

import com.google.gson.Gson;

import Emp.Emp;
import Emp.EmpList;
import common.MyRequest;
import net.sf.json.JSONObject;

public class EmpRequest3 {
	public static void main(String[] args) {
		
		String strUrl = "http://localhost:81/bank/empList3.jsp";
		String response = MyRequest.get(strUrl);
		
		//gson 
		Gson gson = new Gson();
		Emp emp= gson.fromJson(response, Emp.class);
		System.out.println(emp.getName());

		//json-lib
		JSONObject obj = JSONObject.fromObject(response);
		Emp emp2 = (Emp) JSONObject.toBean( obj, Emp.class ); 
		System.out.println(emp.getAddr());
	}
}
