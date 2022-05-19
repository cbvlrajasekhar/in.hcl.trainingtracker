package in.hcl.scheduleapi.exception;

public class ScheduleNotFoundExceptionResponse extends ScheduleIdExceptionResponse {
	
	public ScheduleNotFoundExceptionResponse(Long id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	private String scheduleNotFound;

	public ScheduleNotFoundExceptionResponse(String scheduleNotFound) {
		super(scheduleNotFound);
		this.scheduleNotFound=scheduleNotFound;
	}

	public String getScheduleNotFound() {
		return scheduleNotFound;
	}

	public void setScheduleNotFound(String scheduleNotFound) {
		this.scheduleNotFound = scheduleNotFound;
	}
	
	
	

}



