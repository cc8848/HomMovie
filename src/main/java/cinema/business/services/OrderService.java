package cinema.business.services;

import java.util.List;

import cinema.business.entities.Order;
import cinema.business.entities.repositories.OrderRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    
    public OrderService() {
        super();
    }
    
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(final Integer id) {
        return orderRepository.findById(id);
    }

    public List<Order> findByCustomerId(final Integer customerId) {
        return orderRepository.findByCustomerId(customerId);
    }
}
