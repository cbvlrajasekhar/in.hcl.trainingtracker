package in.hcl.employee_management.service;

import in.hcl.employee_management.domain.Employee;

public interface EmployeeService {
	
	public Employee saveorUpdate(Employee employee);
	public Employee findEmployeeByEmployeeIdentifier(String employeeId);
	public Iterable<Employee> findAllEmployee();
	
	public void deleteEmployeeByEmployeeIdentifier(String employeeId);

}
