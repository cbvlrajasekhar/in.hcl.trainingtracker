package in.hcl.report_management.modal;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Schedule {

	private Long id;
	private String name;
	private Long expectedTrainees;
	private Date scheduleDate;
	private Date updateDate;
	private Date completedDate;
	private double budget;
	private String status;
	private Long trainingId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Date getCompletedDate() {
		return completedDate;
	}
	public void setCompletedDate(Date completedDate) {
		this.completedDate = completedDate;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Long getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(Long trainingId) {
		this.trainingId = trainingId;
	}
	
}
