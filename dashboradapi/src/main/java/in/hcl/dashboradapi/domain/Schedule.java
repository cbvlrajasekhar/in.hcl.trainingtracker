package in.hcl.dashboradapi.domain;



import java.beans.JavaBean;
import java.util.Date;
@JavaBean
public class Schedule {

	private Long id;
	private String trainingId;
	private String name;
	private Long expectedTrainees;
	private Date scheduleDate;
	private Date updateDate;
	private Date budget;
	private Date status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(String trainingId) {
		this.trainingId = trainingId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getExpectedTrainees() {
		return expectedTrainees;
	}
	public void setExpectedTrainees(Long expectedTrainees) {
		this.expectedTrainees = expectedTrainees;
	}
	public Date getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Date getBudget() {
		return budget;
	}
	public void setBudget(Date budget) {
		this.budget = budget;
	}
	public Date getStatus() {
		return status;
	}
	public void setStatus(Date status) {
		this.status = status;
	}
}
