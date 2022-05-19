package in.hcl.employee_management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public EmployeeNotFoundException() {
		super();
		
	}
	public EmployeeNotFoundException(String errmsg) {
		super(errmsg);
	}

}
