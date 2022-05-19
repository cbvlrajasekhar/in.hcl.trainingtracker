package in.hcl.scheduleapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.hcl.scheduleapi.domain.Schedule;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Long> {
	
	Schedule findScheduleById(Long id);
	
	Iterable<Schedule> findAll();

}
