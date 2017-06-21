package cinema.business.entities.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cinema.business.entities.Cinema;

@Repository
public interface CinemaRepository extends CrudRepository<Cinema, Integer> {
    @Query("select * from Cinema")
    public List<Cinema> findAll();

    @Query("select * from Cinema where CinemaId = ?1")
    public Cinema findById(final Integer id);

    @Query("select * from Cinema where CinemaName = ?1")
    public Cinema findByName(final String name);

    @Query("select * from Cinema where CinemaAddress like ?1")
    public Cinema findByAddr(final String addr);
    
}
