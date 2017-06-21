package cinema.business.entities.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cinema.business.entities.Schedule;


@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Integer>  {
    @Query("select * from Schedule")
    public List<Schedule> findAll();

    @Query("select * from Schedule where UserId = ?1")
    public Schedule findByCustomerId(final Integer id);

    @Query("select * from Schedule where CinemaId = ?1")
    public Schedule findByCinemaId(final Integer id);
    

}
