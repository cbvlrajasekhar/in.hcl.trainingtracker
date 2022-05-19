package in.hcl.employee_management.exception;

public class EmployeeIdExceptionResponse {
	
	private String employeeIdentifier;
	
	public EmployeeIdExceptionResponse(String employeeIdentifier) {
		super();
		this.employeeIdentifier =employeeIdentifier;
	}
	public String getEmployeeIdentifier() {
		return employeeIdentifier;
	}
	public void setEmployeeIdentifier(String employeeIdentifier) {
		this.employeeIdentifier=employeeIdentifier;
	}

}
