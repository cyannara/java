package rest_api.http;

import com.google.gson.Gson;

import rest_api.Emp.Emp;
import rest_api.Emp.EmpList;
import rest_api.common.MyRequest;

public class EmpRequest {
	public static void main(String[] args) {
		
		String strUrl = "http://localhost:81/bank/empList.jsp";
		String response = MyRequest.get(strUrl);

		
		Gson gson = new Gson();
		EmpList empList = gson.fromJson(response, EmpList.class);
		for(Emp emp : empList.getEmpList()) {
			System.out.println(emp.getName());
		}
		
		/*
		 * JSONObject obj = (JSONObject) JSONObject.stringToValue(response); EmpList
		 * list = (EmpList) JSONObject.toBean( obj, EmpList.class ); for(Emp emp :
		 * list.getEmpList()) { System.out.println(emp.getName()); }
		 */
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
