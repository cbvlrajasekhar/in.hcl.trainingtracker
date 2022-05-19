package in.hcl.employee_management.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.hcl.employee_management.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
	
          Employee findByEmployeeIdentifier(String employeeIdentifier);
          Iterable<Employee> findAll();
}
