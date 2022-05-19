package in.hcl.employee_management.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message="Employee name is required")
	private String name;
	@NotBlank(message="Employeeidentifier is required")
	@Size(min=3,max=7, message="please use 3 to 7 characters only")
	@Column(updatable=false,unique=true)
	private String employeeIdentifier;
	@NotBlank(message="employement type is required ,whether the employee is onrole or offrole")
	private String type;
	@NotBlank(message="employee designation is required")
	private String designation;
	private Double salary;
	@NotBlank(message="Email id of the employee is required")
	private String email;
	@NotBlank(message="mobile number is required")
	@Size(min=10,max=16, message="please use 10 to 16 characters only")
	private String mobileNo;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date joined_date;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date relived_date;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date created_at;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date updated_at;
	
	public Employee() {
		super();
	}

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

	public String getEmployeeIdentifier() {
		return employeeIdentifier;
	}

	public void setEmployeeIdentifier(String employeeIdentifier) {
		this.employeeIdentifier = employeeIdentifier;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Date getJoined_date() {
		return joined_date;
	}

	public void setJoined_date(Date joined_date) {
		this.joined_date = joined_date;
	}

	public Date getRelived_date() {
		return relived_date;
	}

	public void setRelived_date(Date relived_date) {
		this.relived_date = relived_date;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", employeeIdentifier=" + employeeIdentifier + ", type=" + type
				+ ", designation=" + designation + ", salary=" + salary + ", email=" + email + ", mobileNo=" + mobileNo
				+ ", joined_date=" + joined_date + ", relived_date=" + relived_date + ", created_at=" + created_at
				+ ", updated_at=" + updated_at + "]";
	}

	@PrePersist
	public void onCreate() {
		this.created_at=new Date();
	}
	@PreUpdate
	public void onUpdate() {
		this.updated_at=new Date();
	}

}
