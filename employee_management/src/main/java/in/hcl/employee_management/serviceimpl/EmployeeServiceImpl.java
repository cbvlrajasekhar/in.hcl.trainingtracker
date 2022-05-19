package in.hcl.employee_management.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hcl.employee_management.domain.Employee;
import in.hcl.employee_management.exception.EmployeeIdException;
import in.hcl.employee_management.repository.EmployeeRepository;
import in.hcl.employee_management.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
	private EmployeeRepository employeeRepository;

@Override
public Employee saveorUpdate(Employee employee) {
	try {
		employee.setName(employee.getName().toUpperCase());
		employee.setType(employee.getType().toUpperCase());
		employee.setDesignation(employee.getDesignation().toUpperCase());
		 return employeeRepository.save(employee);
	}catch(Exception ex) {
		throw new EmployeeIdException("Employee Id :"+employee.getEmployeeIdentifier()+" Already Exists");
	}
	
}

@Override
public Employee findEmployeeByEmployeeIdentifier(String employeeId) {
	Employee employee=employeeRepository.findByEmployeeIdentifier(employeeId);
	if(employee==null) {
		throw new EmployeeIdException ("Employee Identifier :"+employeeId.toUpperCase()+" Does not Exists");
	}
	return employee;
}

@Override
public Iterable<Employee> findAllEmployee() {
	
	return employeeRepository.findAll();
}

@Override
public void deleteEmployeeByEmployeeIdentifier(String employeeId) {
	Employee employee=employeeRepository.findByEmployeeIdentifier(employeeId.toUpperCase());
	if(employee==null) {
		throw new EmployeeIdException("Employee Identifier:"+employeeId.toUpperCase()+" Does not exists");
		
	}
	employeeRepository.delete(employee);
}

}