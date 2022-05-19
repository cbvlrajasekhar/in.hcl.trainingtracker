package in.hcl.dashboradapi.domain;

public class Dashboard {
	private Long totalTrainings;
	private Long totalTrainingHours;
	private String trainingStatus;
	private String trainingType;
	private Double budget;
	private Double trainingRating;
	


	public Dashboard() {
		super();
		
	}

	public Long getTotalTrainings() {
		return totalTrainings;
	}


	public void setTotalTrainings(Long totalTrainings) {
		this.totalTrainings = totalTrainings;
	}


	public Long getTotalTrainingHours() {
		return totalTrainingHours;
	}


	public void setTotalTrainingHours(Long totalTrainingHours) {
		this.totalTrainingHours = totalTrainingHours;
	}


	public String getTrainingStatus() {
		return trainingStatus;
	}


	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}


	public String getTrainingType() {
		return trainingType;
	}


	public void setTrainingType(String trainingTypes) {
		this.trainingType = trainingTypes;
	}


	public Double getBudget() {
		return budget;
	}


	public void setBudget(Double budget) {
		this.budget = budget;
	}


	public Double getTrainingRating() {
		return trainingRating;
	}


	public void setTrainingRating(Double trainingRating) {
		this.trainingRating = trainingRating;
	}


	@Override
	public String toString() {
		return "Dashboard [totalTrainings=" + totalTrainings + ", totalTrainingHours=" + totalTrainingHours
				+ ", trainingStatus=" + trainingStatus + ", trainingTypes=" + trainingType + ", budget=" + budget
				+ ", trainingRating=" + trainingRating + "]";
	}


	
	
	
	

}
