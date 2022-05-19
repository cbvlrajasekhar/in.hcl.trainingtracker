package in.hcl.training_registration.exception;

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
