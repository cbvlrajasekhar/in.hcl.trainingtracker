package in.hcl.training_registration.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hcl.training_registration.exception.TrainingRegistrationIdException;
import in.hcl.training_registration.modal.TrainingRegistration;
import in.hcl.training_registration.repository.TrainingRegistrationRepository;
import in.hcl.training_registration.service.TrainingRegistrationService;

@Service
public class TrainingRegistrationServiceImpl implements TrainingRegistrationService {
	
	@Autowired
	private TrainingRegistrationRepository trainingRegistrationRepository;

	@Override
	public TrainingRegistration saveOrUpdate(TrainingRegistration trainingRegistration) {
		TrainingRegistration newTrainingRegistration = trainingRegistrationRepository.findByTrainingRegistrationId(trainingRegistration.getTrainingRegistrationId());
		if(newTrainingRegistration != null) {
			throw new TrainingRegistrationIdException("Training Registration with TrainingRegistration Id: "+trainingRegistration.getTrainingRegistrationId()+ " Already Exist");
		}
		return trainingRegistrationRepository.save(trainingRegistration);
	}

	@Override
	public TrainingRegistration findByTrainingRegistrationId(Long trainingRegistrationId) {
		TrainingRegistration trainingRegistration = trainingRegistrationRepository.findByTrainingRegistrationId(trainingRegistrationId);
		if(trainingRegistration == null) {
			throw new TrainingRegistrationIdException("Training Registration with TrainingRegistration Id: "+trainingRegistrationId+ " Does not Exist");
		}
		return trainingRegistration;
	}

	@Override
	public List<TrainingRegistration> findAllTrainingRegistration() {
		List<TrainingRegistration> trainingRegistrationList = trainingRegistrationRepository.findAll();
		return trainingRegistrationList;
	}

	@Override
	public void deleteByTrainingRegistrationId(Long trainingRegistrationId) {
		TrainingRegistration trainingRegistration = trainingRegistrationRepository.findByTrainingRegistrationId(trainingRegistrationId);
		if(trainingRegistration == null) {
			throw new TrainingRegistrationIdException("Training Registration with TrainingRegistration Id: "+trainingRegistrationId+ " Does not Exist");
		}
		trainingRegistrationRepository.deleteByTrainingRegistrationId(trainingRegistrationId);
	}
}
