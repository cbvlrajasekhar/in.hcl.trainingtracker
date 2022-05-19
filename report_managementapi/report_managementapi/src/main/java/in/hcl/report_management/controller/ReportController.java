package in.hcl.report_management.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.hcl.report_management.modal.Employee;
import in.hcl.report_management.modal.Schedule;
import in.hcl.report_management.modal.Training;
import in.hcl.report_management.modal.TrainingRegistration;
import in.hcl.report_management.modal.User;

@RestController
@RequestMapping("/api/report")
public class ReportController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/employee")
	public ResponseEntity<?> getEmployeeReport(){
		List<Employee> employeeList = new ArrayList<>(); 
		employeeList = restTemplate.getForObject("http://employee-management/api/employee/all", List.class);
		return new ResponseEntity<List<Employee>>(employeeList ,HttpStatus.OK);
	}
	
	@GetMapping("/schedule")
	public ResponseEntity<?> getScheduleReport(){
		List<Schedule> scheduleList = new ArrayList<>(); 
		scheduleList = restTemplate.getForObject("http://schedule-management/api/schedules/all", List.class);
		return new ResponseEntity<List<Schedule>>(scheduleList ,HttpStatus.OK);
	}
	
	@GetMapping("/user")
	public ResponseEntity<?> getUserReport(){
		List<User> userList = new ArrayList<>(); 
		userList = restTemplate.getForObject("http://user-management/user/all", List.class);
		return new ResponseEntity<List<User>>(userList ,HttpStatus.OK);
	}
	
	@GetMapping("/training")
	public ResponseEntity<?> getTrainingReport(){
		List<Training> trainingList = new ArrayList<>(); 
		trainingList = restTemplate.getForObject("http://Training_management/api/trainings/all", List.class);
		return new ResponseEntity<List<Training>>(trainingList ,HttpStatus.OK);
	}
	
	@GetMapping("/trainingRegistration")
	public ResponseEntity<?> getTrainingRegistrationReport(){
		List<TrainingRegistration> trainingRegistrationList = new ArrayList<>(); 
		trainingRegistrationList = restTemplate.getForObject("http://trainingRegistration-service/api/trainingRegistration/findall", List.class);
		return new ResponseEntity<List<TrainingRegistration>>(trainingRegistrationList ,HttpStatus.OK);
	}

}