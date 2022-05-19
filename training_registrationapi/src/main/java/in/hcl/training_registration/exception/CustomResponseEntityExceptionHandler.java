package in.hcl.training_registration.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler {
	
	public final ResponseEntity<Object> handlerTrainingRegistrationIdException(TrainingRegistrationIdException ex, WebRequest request){
		TrainingRegistrationIdExceptionResponse exceptionResponse = new TrainingRegistrationIdExceptionResponse(ex.getMessage());
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
		
	}
}
