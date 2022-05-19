package in.hcl.dashboradapi.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.hcl.dashboradapi.domain.Schedule;
import in.hcl.dashboradapi.domain.Training;
import in.hcl.dashboradapi.service.DashboardService;
@Service
public class DashboardServiceImpl implements DashboardService {
	@Autowired
	private RestTemplate restTemplate;
	
	
	private Training training=new Training();

	@Override
	public Long findTotalTrainings() {
		int count=0;
		List<Training> trainings = restTemplate.getForObject("http://training-service/api/trainings/all" , List.class);
		for(int i=0;i<trainings.size();i++) {
			count++;
		}
		return (long) count;
	}

	@Override
	public Long findTotalHoursOfTrainings(Long trainingRegID) {
		return  (long) 20;
	}

	@Override
	public String findTrainingStatus(String name) {
		
		return "Completed";
	}

	@Override
	public String findTrainingType(String name) {
		Training training1 = restTemplate.getForObject("http://training-service/api/trainings/"+ name, Training.class);
		
		return training1.getType();
	}

	@Override
	public Double findTrainingBudget( String name) {
Training training2 = restTemplate.getForObject("http://training-service/api/trainings/"+name, Training.class);
		
		return training2.getPrice();
	}

	@Override
	public Double findTrainingRating(String name) {
Training training3 = restTemplate.getForObject("http://training-service/api/trainings/"+ name, Training.class);
		
		return training3.getTraining_rating();
	}

}
