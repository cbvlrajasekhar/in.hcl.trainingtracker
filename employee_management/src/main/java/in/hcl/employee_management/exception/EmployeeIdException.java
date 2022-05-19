package in.hcl.employee_management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeIdException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public EmployeeIdException() {
		super();
	}
	public EmployeeIdException(String errmsg) {
		super(errmsg);
	}

}
