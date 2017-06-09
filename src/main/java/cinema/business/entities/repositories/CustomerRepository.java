package cinema.business.entities.repositories;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import cinema.business.entities.Customer;


public class CustomerRepository {
    private static final CustomerRepository INSTANCE = new CustomerRepository();
    private final Map<Integer,Customer> customersById;

    public static CustomerRepository getInstance() {
        return INSTANCE;
    }

    private CustomerRepository() {
        super();
        this.customersById = new LinkedHashMap<Integer, Customer>();
    }
    
    public void addCustomer(Customer customer) {
    	this.customersById.put(customer.getId(), customer);
    }

    public void deleteCustomer(Customer customer) {
    	this.customersById.remove(customer.getId());
    }
    
    public List<Customer> findAll() {
        return new ArrayList<Customer>(this.customersById.values());
    }
    
    public Customer findById(final Integer id) {
        return this.customersById.get(id);
    }
    
}
