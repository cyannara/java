package rest_api.http;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import Emp.Emp;
import Emp.EmpList;
import common.MyRequest;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class EmpRequest {
	public static void main(String[] args) {
		
		String strUrl = "http://localhost:81/bank/empList.jsp";
		String response = MyRequest.get(strUrl);

		/*
		Gson gson = new Gson();
		EmpList empList = gson.fromJson(response, EmpList.class);
		for(Emp emp : empList.getEmpList()) {
			System.out.println(emp.getName());
		}*/
		
		JSONObject obj = JSONObject.fromObject(response);
		EmpList list = (EmpList) JSONObject.toBean( obj, EmpList.class );  
		for(Emp emp : list.getEmpList()) {
			System.out.println(emp.getName());
		}
		/*		
		JSONArray emplist = obj.getJSONArray("empList");
		for(int i=0; i< emplist.size(); i++) {
			JSONObject emp = emplist.getJSONObject(i);
			System.out.println(emp.getString("name"));
			System.out.println(emp.getInt("age"));
		}
		
		for(Object temp: emplist) {
			JSONObject emp = (JSONObject)temp;
			System.out.println(emp.getString("name"));
			System.out.println(emp.getInt("age"));
		}
		*/
	}
}
