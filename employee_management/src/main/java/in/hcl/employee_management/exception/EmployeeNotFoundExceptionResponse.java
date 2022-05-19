package in.hcl.employee_management.exception;

public class EmployeeNotFoundExceptionResponse {

	private String employeeNotFound;
	
	public EmployeeNotFoundExceptionResponse (String employeeNotFound) {
		super();
		this.setEmployeeNotFound(employeeNotFound);
	}

	public String getEmployeeNotFound() {
		return employeeNotFound;
	}

	public void setEmployeeNotFound(String employeeNotFound) {
		this.employeeNotFound = employeeNotFound;
	}
	
}
