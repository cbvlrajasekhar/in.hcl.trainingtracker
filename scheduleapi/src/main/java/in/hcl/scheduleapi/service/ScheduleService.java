package in.hcl.scheduleapi.service;

import in.hcl.scheduleapi.domain.Schedule;

public interface ScheduleService {
	
	public Schedule saveOrUpdate(Schedule schedule);
	public Schedule findScheduleByScheduleId(Long id);
	public Iterable<Schedule> findAllSchedule();
	public void deleteScheduleById(Long id);
}
