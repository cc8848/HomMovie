package cinema.business.entities.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cinema.business.entities.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer>  {
    @Query("select * from User")
    public List<User> findAll();

    @Query("select * from User where UserId = ?1")
    public User findById(final Integer id);

    @Query("select * from User where Phone = ?1")
    public User findByPhone(final String phone);
    
}
