package cinema.business.entities.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cinema.business.entities.Movie;


@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer>  {
    @Query("select * from Movie")
    public List<Movie> findAll();

    @Query("select * from Movie where MovieId = ?1")
    public Movie findById(final Integer id);

    @Query("select * from Movie where MovieName = ?1")
    public Movie findByName(final String name);
    
}
