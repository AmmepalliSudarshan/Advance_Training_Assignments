import java.util.LinkedList;

public class Employee {
	int EmployeeNo;
	String EmployeeName;
	String Address;
	public Employee(int employeeNo, String employeeName, String address) {
		super();
		EmployeeNo = employeeNo;
		EmployeeName = employeeName;
		Address = address;
	}
	public int getEmployeeNo() {
		return EmployeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		EmployeeNo = employeeNo;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	

}
