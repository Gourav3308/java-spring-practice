package in.gm.beans;

public class Employee {
	private String empName;
	private String empId;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public void dispinfo() {
		System.out.println("EmpName :"+empName);
		System.out.println("EmpId :"+empId);
	}

}
