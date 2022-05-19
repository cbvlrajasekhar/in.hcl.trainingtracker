package in.hcl.scheduleapi.exception;

public class ScheduleIdExceptionResponse {
	
	private Long id;

	public ScheduleIdExceptionResponse(Long scheduleNotFound) {
		super();
		this.id=scheduleNotFound;
	}
	
	

	public ScheduleIdExceptionResponse(String msg) {
		super();
		
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	

}
