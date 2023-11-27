package day10JDBC.dept;

public class DeptBeans {
	private String locationId;
	private String managerId;
	private String departmentName;
	private String departmentId;
	
	//생성자
	public DeptBeans() {}
	public DeptBeans(String locationId, String managerId, String departmentName, String departmentId) {
		super();
		this.locationId = locationId;
		this.managerId = managerId;
		this.departmentName = departmentName;
		this.departmentId = departmentId;
	}
	
	//getter/setter
	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	
	//오버라이드 메서드
	@Override
	public String toString() {
		return "DeptBeans [locationId=" + locationId + ", managerId=" + managerId + ", deaprtmentName=" + departmentName
				+ ", departmentId=" + departmentId + "]";
	}	
	
	//일반 메서드
}
