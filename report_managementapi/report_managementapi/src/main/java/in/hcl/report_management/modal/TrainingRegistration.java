package in.hcl.report_management.modal;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;


public class TrainingRegistration {
	
	private Long trainingRegistrationId;
	private Long employeeId;
	private Long scheduleId;
	private String employeeIdebtifier;
	private Schedule schedule;
	private Employee employee;
	private Date createdAt;
	private Date updatedAt;
	
	public Long getTrainingRegistrationId() {
		return trainingRegistrationId;
	}
	public void setTrainingRegistrationId(Long trainingRegistrationId) {
		this.trainingRegistrationId = trainingRegistrationId;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public Long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getEmployeeIdebtifier() {
		return employeeIdebtifier;
	}
	public void setEmployeeIdebtifier(String employeeIdebtifier) {
		this.employeeIdebtifier = employeeIdebtifier;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
