package cinema.business.services;

import java.util.List;

import cinema.business.entities.Schedule;
import cinema.business.entities.repositories.ScheduleRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ScheduleService {
    @Autowired
    private ScheduleRepository scheduleRepository;
    
    public ScheduleService() {
        super();
    }
    
    public List<Schedule> findAll() {
        return scheduleRepository.findAll();
    }

    public Schedule findByCustomerId(final Integer id) {
        return scheduleRepository.findByCustomerId(id);
    }

    public Schedule findByCinemaId(final Integer customerId) {
        return scheduleRepository.findByCinemaId(customerId);
    }
}
