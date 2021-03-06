package in.hcl.report_management.modal;

import java.util.Date;

public class Training {
	private Long id;
	private String  modulename;
	private String type;
	private double price;
	private double percentage_scored;
	private Date scheduled_date;
	private Date completed_by;
	private String trainer_name;
	private double training_rating;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
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
	public void setTraining_rating(double training_rating) {
		this.training_rating = training_rating;
	}
	
}
