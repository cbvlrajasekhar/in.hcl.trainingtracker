/**
 * 
 */
package in.hcl.dashboradapi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.hcl.dashboradapi.domain.Dashboard;
import in.hcl.dashboradapi.domain.Training;
import in.hcl.dashboradapi.service.DashboardService;

/**
 * @author manesambhaji.sadas
 *
 */
@RestController
@RequestMapping("api/dashboard")
public class DashboardController {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private DashboardService dashboardService;
	
	@GetMapping("/totalTrainings")
	public ResponseEntity<?> getTotalTrainings(){
	Long totalTrainings = dashboardService.findTotalTrainings();
	
	return new ResponseEntity<Long>(totalTrainings ,HttpStatus.OK);

	}
	
	@GetMapping("/totalTrainingDuration/{trainingID}")
	public ResponseEntity<?> getTotalTrainingDuration(@PathVariable Long trainingID){
	Long totalHours = dashboardService.findTotalHoursOfTrainings(trainingID);
	
	return new ResponseEntity<Long>(totalHours ,HttpStatus.OK);

	}
	
	@GetMapping("/trainingDetails/{moduleName}")
	public ResponseEntity<?> getTrainingDetails(@PathVariable String moduleName){
		Training training =new Training();
	training.setType(dashboardService.findTrainingType(moduleName));
	training.setPrice(dashboardService.findTrainingBudget(moduleName));
	training.setTraining_rating( dashboardService.findTrainingRating(moduleName));
	training.setStatus(dashboardService.findTrainingStatus(moduleName));
	
	return new ResponseEntity<Training>(training ,HttpStatus.OK);

	}
	
}
