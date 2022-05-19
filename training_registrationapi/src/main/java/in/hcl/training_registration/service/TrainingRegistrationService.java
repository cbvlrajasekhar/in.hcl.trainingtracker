package in.hcl.training_registration.service;

import java.util.List;

import in.hcl.training_registration.modal.TrainingRegistration;

public interface TrainingRegistrationService {
	
	public TrainingRegistration saveOrUpdate(TrainingRegistration trainingRegistration);
	
	public TrainingRegistration findByTrainingRegistrationId(Long trainingRegistrationId);
	
	public List<TrainingRegistration> findAllTrainingRegistration();
	
	public void deleteByTrainingRegistrationId(Long TrainingRegistration);
	
}
