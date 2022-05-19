package in.hcl.training_registration.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TrainingRegistrationIdException extends RuntimeException{
		
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TrainingRegistrationIdException() {
		super();
	}
	
	public TrainingRegistrationIdException(String errMsg) {
		super(errMsg);
	}
}
