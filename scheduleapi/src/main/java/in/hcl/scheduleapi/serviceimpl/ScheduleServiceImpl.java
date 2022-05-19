package in.hcl.scheduleapi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.hcl.scheduleapi.domain.Schedule;
import in.hcl.scheduleapi.exception.ScheduleIdException;
import in.hcl.scheduleapi.repository.ScheduleRepository;
import in.hcl.scheduleapi.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService {
	
	@Autowired
	private ScheduleRepository scheduleRepository;

	@Override
	public Schedule saveOrUpdate(Schedule schedule) {
		
		return scheduleRepository.save(schedule);
	}

	@Override
	public Schedule findScheduleByScheduleId(Long id) {
		Schedule schedule = scheduleRepository.findScheduleById(id);
		if (schedule==null) {
			throw new ScheduleIdException("Schedule with ID :"+id+" is not found");
		}
		return schedule;
	}

	@Override
	public Iterable<Schedule> findAllSchedule() {
		// TODO Auto-generated method stub
		return scheduleRepository.findAll();
	}

	@Override
	public void deleteScheduleById(Long id) {
		Schedule schedule= scheduleRepository.findScheduleById(id);
		if(schedule==null) {
			throw new ScheduleIdException("Schedule with ID :"+id+" is not found");
		}
		scheduleRepository.delete(schedule);
	}

}
