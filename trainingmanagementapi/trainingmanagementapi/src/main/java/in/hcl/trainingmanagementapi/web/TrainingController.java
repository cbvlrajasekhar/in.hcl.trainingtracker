package in.hcl.trainingmanagementapi.web;


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

import in.hcl.trainingmanagementapi.domain.Training;
import in.hcl.trainingmanagementapi.repository.TrainingRepository;
import in.hcl.trainingmanagementapi.service.TrainingService;
import in.hcl.trainingmanagementapi.serviceimpl.MapValidationErrorService;

@RestController
@RequestMapping("/api/trainings")
public class TrainingController {
	
	@Autowired
	private TrainingRepository trainingRepositoru;
	
	@Autowired
	private TrainingService trainingService;
	@Autowired
	private MapValidationErrorService mapValidationErrorservice;
	@PostMapping("")
	public ResponseEntity<?> createNewTrainingmodule(@Valid @RequestBody Training training,BindingResult result) {
		ResponseEntity<?> errorMap=mapValidationErrorservice.mapValidationError(result);
		if(errorMap!=null)return errorMap;
		Training savedTraining=trainingService.saveOrUpdate(training);	
		return new ResponseEntity<Training>(savedTraining,HttpStatus.CREATED);
	}
	@GetMapping("/{modulename}")
public  ResponseEntity<?>getTrainingByModulename(@PathVariable String modulename){
		Training training=trainingService.findTrainingByModulename(modulename);
	return new ResponseEntity<Training>(training,HttpStatus.OK);
	
}
	
	@GetMapping("/all")
	public Iterable<Training>getAllTrainings(){
		return trainingService.findAllTraining();
		
	}
	@DeleteMapping("{modulename}")
	public ResponseEntity<?>deleteTraining(@PathVariable String modulename){
		trainingService.deleteTrainingByModulename(modulename);
		return new ResponseEntity<String>("Training with module name:"+modulename.toUpperCase()+"Deleted successfully!",HttpStatus.OK);
	}
	
}