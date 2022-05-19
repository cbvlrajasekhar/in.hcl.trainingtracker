package in.hcl.dashboradapi.domain;



import java.beans.JavaBean;
import java.util.Date;


@JavaBean
public class Training {
	
	private Long id;
	
	private String  modulename;
	private String type;
	
	private double price;
	private double percentage_scored;
	private Long Hours ;
	private Date scheduled_date;
	private String status;
	private Date completed_by;
	
	private String trainer_name;
	private double training_rating;
	
	public Training() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModulename() {
		return modulename;
	}
	public void setModulename(String modulename) {
		this.modulename = modulename;
	}
	public String isType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(Double double1) {
		this.price = double1;
	}
	public double getPercentage_scored() {
		return percentage_scored;
	}
	public void setPercentage_scored(double percentage_scored) {
		this.percentage_scored = percentage_scored;
	}
	public Date getScheduled_date() {
		return scheduled_date;
	}
	public void setScheduled_date(Date scheduled_date) {
		this.scheduled_date = scheduled_date;
	}
	public Date getCompleted_by() {
		return completed_by;
	}
	public void setCompleted_by(Date completed_by) {
		this.completed_by = completed_by;
	}
	public String getTrainer_name() {
		return trainer_name;
	}
	public void setTrainer_name(String trainer_name) {
		this.trainer_name = trainer_name;
	}
	public double getTraining_rating() {
		return training_rating;
	}
	public void setTraining_rating(Double double1) {
		this.training_rating = double1;
	}
	public String getType() {
		return type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setTraining_rating(double training_rating) {
		this.training_rating = training_rating;
	}
	public Long getHours() {
		return Hours;
	}
	public void setHours(Long hours) {
		Hours = hours;
	}
		

}
