package in.hcl.employee_management.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.hcl.employee_management.domain.Employee;
import in.hcl.employee_management.service.EmployeeService;
import in.hcl.employee_management.serviceimpl.MapValidationErrorService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
@Autowired
private EmployeeService employeeService;
@Autowired
private MapValidationErrorService mapValidationErrorService;
@Autowired
private RestTemplate restTemplate;
@PostMapping("")
public ResponseEntity<?> createNewProject(@Valid @RequestBody Employee employee,BindingResult result){
	ResponseEntity<?> errorMap =mapValidationErrorService.mapValidationError(result);
	if(errorMap!=null)return errorMap;
	Employee savedEmployee=employeeService.saveorUpdate(employee);
	return new ResponseEntity<Employee>(savedEmployee,HttpStatus.CREATED);
	
}
@GetMapping("/{employeeId}")
public ResponseEntity<?> getEmployeeById(@PathVariable String employeeId){
	Employee employee = employeeService.findEmployeeByEmployeeIdentifier(employeeId);
	return new ResponseEntity<Employee>(employee,HttpStatus.OK);
}
@GetMapping("/all")
public Iterable<Employee> getAllEmployees(){
	return employeeService.findAllEmployee();
}
@DeleteMapping("/{employeeId}")
public ResponseEntity<?> deleteEmployeeByEmployeeIdentifier(@PathVariable String employeeId){
	 employeeService.deleteEmployeeByEmployeeIdentifier(employeeId);
	return new ResponseEntity<String>("Employee Id :"+employeeId.toUpperCase()+"  Deleted succesfully",HttpStatus.OK);
}
}
