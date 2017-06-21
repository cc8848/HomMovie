package cinema.business.entities.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cinema.business.entities.Order;


@Repository
public interface OrderRepository extends CrudRepository<Order, Integer>  {
    @Query("select * from OrderList")
    public List<Order> findAll();

    @Query("select * from OrderList where OrdreId = ?1")
    public Order findById(final Integer id);

    @Query("select * from OrderList where UserId = ?1")
    public List<Order> findByCustomerId(final Integer customerId);
}

