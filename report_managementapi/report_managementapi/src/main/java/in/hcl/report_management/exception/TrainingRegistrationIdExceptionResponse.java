package in.hcl.report_management.exception;

public class TrainingRegistrationIdExceptionResponse {
	
	private String trainingRegistrationnId;
	
	public TrainingRegistrationIdExceptionResponse(String trainingRegistrationnId) {
		super();
		this.trainingRegistrationnId = trainingRegistrationnId;
	}
	

	public String getTrainingRegistrationnId() {
		return trainingRegistrationnId;
	}

	public void setTrainingRegistrationnId(String trainingRegistrationnId) {
		this.trainingRegistrationnId = trainingRegistrationnId;
	}
	
}
