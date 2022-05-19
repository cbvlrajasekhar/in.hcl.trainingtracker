package in.hcl.scheduleapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ScheduleNotFoundException {
	
	public final long serialVersionUID=1;

	public ScheduleNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ScheduleNotFoundException(String errMsg) {
		super();
	}

}