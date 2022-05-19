package in.hcl.training_registration.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.hcl.training_registration.modal.Employee;
import in.hcl.training_registration.modal.Schedule;
import in.hcl.training_registration.modal.TrainingRegistration;
import in.hcl.training_registration.service.TrainingRegistrationService;
import in.hcl.training_registration.serviceImpl.MapValidationErrorService;

@RestController
@RequestMapping("/api/trainingRegistration")
public class TrainingRegistrationController {

	@Autowired
	private TrainingRegistrationService trainingRegistrationService;

	@Autowired
	private MapValidationErrorService mapValidationErrorService;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/find/{trainingId}")
	public ResponseEntity<?> getScheduleByTrainingId(@PathVariable Long trainingId){
		TrainingRegistration trainingRegistration = new TrainingRegistration();
		trainingRegistration = trainingRegistrationService.findByTrainingRegistrationId(trainingId);
		return new ResponseEntity<TrainingRegistration>(trainingRegistration ,HttpStatus.OK);
	}

	@GetMapping("/findall")
	public ResponseEntity<?> getScheduleByTrainingId(){
		List<TrainingRegistration> trainingRegistrationList = trainingRegistrationService.findAllTrainingRegistration();
		return new ResponseEntity<List<TrainingRegistration>>(trainingRegistrationList ,HttpStatus.OK);
	}

	@GetMapping("trMappedData/{trainingRegistrationId}")
	public ResponseEntity<?> getScheduleByTrainingRegistrationId(@PathVariable Long trainingRegistrationId){
		TrainingRegistration trainingRegistration = trainingRegistrationService.findByTrainingRegistrationId(trainingRegistrationId);
		Schedule newSchedule = restTemplate.getForObject("http://schedule-management/api/schedules/" +trainingRegistration.getScheduleId(), Schedule.class);
		Employee newEmplyee = restTemplate.getForObject("http://employee-management/api/employee/" +trainingRegistration.getEmployeeIdentifier(), Employee.class);
		trainingRegistration.setEmployee(newEmplyee);
		trainingRegistration.setSchedule(newSchedule);
		return new ResponseEntity<TrainingRegistration >(trainingRegistration ,HttpStatus.OK);
	}

	@DeleteMapping("/delete/{trainingRegistrationId}")
	public ResponseEntity<?> deleteSchedule(@PathVariable Long trainingRegistrationId){
		trainingRegistrationService.deleteByTrainingRegistrationId(trainingRegistrationId);
		return new ResponseEntity<String>("Schedule with Trining Id: "+trainingRegistrationId+" Deleted Succesfully!", HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<?> createNewTrainingRegistration(@Valid @RequestBody TrainingRegistration trainingRegistration, BindingResult result){
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		TrainingRegistration savedSchedule = trainingRegistrationService.saveOrUpdate(trainingRegistration);
		return new ResponseEntity<TrainingRegistration>(savedSchedule,HttpStatus.CREATED);
	}

}