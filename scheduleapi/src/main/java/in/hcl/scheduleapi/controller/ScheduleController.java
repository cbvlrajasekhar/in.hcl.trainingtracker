package in.hcl.scheduleapi.controller;

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

import in.hcl.scheduleapi.domain.Schedule;
import in.hcl.scheduleapi.service.ScheduleService;
import in.hcl.scheduleapi.serviceimpl.MapValidationErrorService;

@RestController
@RequestMapping("/api/schedules")
public class ScheduleController {
	@Autowired
	private ScheduleService scheduleService;
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("")
	public ResponseEntity<?> creatNewSchedule(@Valid @RequestBody Schedule schedule, BindingResult result){
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) 
			return errorMap;
		Schedule savedSchedule= scheduleService.saveOrUpdate(schedule);
		return new ResponseEntity<Schedule>(savedSchedule, HttpStatus.CREATED);
	}
	
	@GetMapping("/{scheduleId}")
	public ResponseEntity<?> getScheduleById(@PathVariable Long scheduleId){
		Schedule schedule = scheduleService.findScheduleByScheduleId(scheduleId);
		return new ResponseEntity<Schedule>(schedule, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public Iterable<Schedule> getAllSchedule(){
		return scheduleService.findAllSchedule();
	}
	@DeleteMapping("/{scheduleId}")
	public ResponseEntity<?> deleteSchedule(@PathVariable Long scheduleId){
		scheduleService.deleteScheduleById(scheduleId);
		return new ResponseEntity<String>("Schedule with id :"+ scheduleId +" deleted successfully", HttpStatus.OK);
	}
	

}

	




	
	