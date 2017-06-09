package cinema.business.entities.repositories;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import cinema.business.entities.Customer;
import cinema.business.entities.Order;
import cinema.business.entities.Cinema;
import cinema.business.entities.Movie;
import cinema.business.util.CalendarUtil;


public class OrderRepository {
    private static final OrderRepository INSTANCE = new OrderRepository();
    private final Map<Integer,Order> ordersById;
    private final Map<Integer,List<Order>> ordersByCustomerId;

    
    public static OrderRepository getInstance() {
        return INSTANCE;
    }
    
    private OrderRepository() {
        super();
        
        this.ordersById = new LinkedHashMap<Integer, Order>();
        this.ordersByCustomerId = new LinkedHashMap<Integer, List<Order>>();
    }
    
    public void addCustomerList(Customer customer) {
    	this.ordersByCustomerId.put(customer.getId(), new ArrayList<Order>());
    }

    public void removeCustomerList(Customer customer) {
    	this.ordersByCustomerId.remove(customer.getId());
    }

    public void addOrder(Order order) {
    	this.ordersById.put(order.getId(), order);
    	if (this.ordersByCustomerId.get(order.getCustomer().getId()) == null) {
    		this.ordersByCustomerId.put(order.getCustomer().getId(),
    									new ArrayList<Order>());
    	}
    	this.ordersByCustomerId.get(order.getCustomer().getId()).add(order);
    }

    public void deleteOrder(Order order) {
    	this.ordersById.remove(order.getId());
    }
    
    
    public List<Order> findAll() {
        return new ArrayList<Order>(this.ordersById.values());
    }
    
    public Order findById(final Integer id) {
        return this.ordersById.get(id);
    }
    
    public List<Order> findByCustomerId(final Integer customerId) {
        final List<Order> ordersForCustomerId = this.ordersByCustomerId.get(customerId);
        if (ordersForCustomerId == null) {
            return new ArrayList<Order>();
        }
        return ordersForCustomerId;
    }
}

