package in.hcl.training_registration.modal;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
public class TrainingRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long trainingRegistrationId;
	private Long scheduleId;
	private String employeeIdentifier;
	@JsonInclude
	@Transient
	private Schedule schedule;
	@JsonInclude
	@Transient
	private Employee employee;
	private Date createdAt;
	private Date updatedAt;
	
	public TrainingRegistration() {
		super();
		
	}
	
	public TrainingRegistration(Long scheduleId, String employeeIdentifier) {
		super();
		this.scheduleId = scheduleId;
		this.employeeIdentifier = employeeIdentifier;
	}

	public Long getTrainingRegistrationId() {
		return trainingRegistrationId;
	}

	public void setTrainingRegistrationId(Long trainingRegistrationId) {
		this.trainingRegistrationId = trainingRegistrationId;
	}

	public Long getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getEmployeeIdentifier() {
		return employeeIdentifier;
	}

	public void setEmployeeIdentifier(String employeeIdentifier) {
		this.employeeIdentifier = employeeIdentifier;
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

	@PrePersist
	public void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	public void onUpdate() {
		this.updatedAt = new Date();
	}

	@Override
	public String toString() {
		return "TrainingRegistration [trainingRegistrationId=" + trainingRegistrationId + ", scheduleId=" + scheduleId
				+ ", employeeIdentifier=" + employeeIdentifier + ", schedule=" + schedule + ", employee=" + employee
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
}
