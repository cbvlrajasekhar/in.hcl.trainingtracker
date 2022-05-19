package in.hcl.trainingmanagementapi.exception;

public class TrainingIdExceptionResponse {
	private String modulename;
	public TrainingIdExceptionResponse(String modulename) {
		super();
		this.modulename=modulename;
	}
	public String getModulename() {
		return modulename;
	}
	public void setModulename(String modulename) {
		this.modulename = modulename;
	}
	
	
	
	}


