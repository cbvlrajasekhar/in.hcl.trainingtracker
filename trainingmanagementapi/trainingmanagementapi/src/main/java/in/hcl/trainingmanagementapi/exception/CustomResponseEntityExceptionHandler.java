package in.hcl.trainingmanagementapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice

public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	public final ResponseEntity<Object> handleTrainingIdException (TrainingIdException ex,WebRequest request){
	TrainingIdExceptionResponse exceptionResponse=new TrainingIdExceptionResponse(ex.getMessage());
	return new ResponseEntity<Object>(exceptionResponse,HttpStatus.BAD_REQUEST);
	}


}
