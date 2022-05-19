package in.hcl.dashboradapi.service;

public interface DashboardService {

	public Long findTotalTrainings();
	public Long findTotalHoursOfTrainings(Long trainingRegID);
	public String findTrainingStatus(String moduleName);
	public String findTrainingType(String moduleName);
	public Double findTrainingBudget(String name);
	public Double findTrainingRating(String name);
	
}
