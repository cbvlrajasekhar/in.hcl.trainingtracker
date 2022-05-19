package in.hcl.trainingmanagementapi.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.hcl.trainingmanagementapi.domain.Training;
import in.hcl.trainingmanagementapi.exception.TrainingIdException;
import in.hcl.trainingmanagementapi.repository.TrainingRepository;
import in.hcl.trainingmanagementapi.service.TrainingService;

@Service
public class TrainingServiceImpl implements TrainingService {
	
	@Autowired
	private TrainingRepository trainingRepository;

	@Override
	public Training saveOrUpdate(Training training) {
		try {
         training.setModulename(training.getModulename().toUpperCase());
		return trainingRepository.save(training);
	}catch(Exception ex) {
		throw new TrainingIdException("Training modulename:"+training.getModulename()+"already exists");
	}
	}

	@Override
	public Training findTrainingByModulename (String modulename) {
	Training training=	trainingRepository.findByModulename(modulename);
	if(training==null) {
		throw new TrainingIdException("Modulename:"+modulename.toUpperCase()+"Does not exist");
	}
		return training;
	}

	@Override
	public Iterable<Training>findAllTraining() {
		return trainingRepository.findAll();
	}

	@Override
	public void deleteTrainingByModulename(String modulename) {
		Training training=trainingRepository.findByModulename(modulename.toUpperCase());
		if(training==null) {
			throw new TrainingIdException("Training modulename:"+training.getModulename()+"already exists");
		}
		trainingRepository.delete(training);
		
	}

}
