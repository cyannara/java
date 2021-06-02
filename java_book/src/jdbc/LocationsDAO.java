package jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jdbc.common.ConnectionManager;
import jdbc.common.DAO;

public class LocationsDAO extends DAO {
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	//싱글톤 구현
	public static LocationsDAO instance = new LocationsDAO();
	public static LocationsDAO getInstance() {
		return instance;
	}	

	//다건조회
	public List<Map<String,Object>> selectAll() {
		//결과변수
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		try {
			//1. 드라이버 로딩, 커넥터
			conn = ConnectionManager.getConnect();		
			//2. statement(구문) 실행
			String sql = " select country_id, state_province, city, postal_code, street_address,location_id"
					   + "   from locations";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);			
			//3. 결과처리			
			while(rs.next()) {
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("countryId",     rs.getString("country_id"));
				map.put("stateProvince", rs.getString("state_province"));
				map.put("city",          rs.getString("city"));
				map.put("postalCode",    rs.getString("postal_code"));
				map.put("streetAddress", rs.getString("street_address"));
				map.put("locationId",    rs.getString("location_id"));
				list.add(map);
			}			
			//4. disconnect
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//페이징처리조회
}
