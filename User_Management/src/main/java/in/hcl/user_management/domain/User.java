package in.hcl.user_management.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "UserName is required")
	private String username;
    @Email 
	@Column(unique= true)
	@NotBlank(message = "Email is required")
	private String email;
	
	@NotBlank(message = "Address is required")
	private String address;
	
	@NotBlank(message = "UserRole is required")
	private String userrole;
	
	@NotBlank(message = "Mobile no. is required")
	@Size(min = 10, max = 10, message = "Please enter 10 digit number")
	private String mobileNo;
	
	@NotBlank(message = "Password is required")
	@Size(min = 6, max = 10, message = "Please use minimum 8 charactes")
	private String password;
	
	private Date createdAt;
	
	private Date updateAt;

	public User() {
		super();
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUserrole() {
		return userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	@PrePersist
	public void onCreate() {
		this.createdAt = new Date();
	}

	public void onUpdate() {
		this.updateAt = new Date();
	}
}
