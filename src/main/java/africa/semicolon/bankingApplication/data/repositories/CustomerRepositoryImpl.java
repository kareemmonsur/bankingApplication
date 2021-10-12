package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{
    private  List<Customer> customers = new ArrayList<>();
    @Override
    public Customer save(Customer customer) {
        customers.add(customer);
        Customer foundCustomer = findByCustomerId(customer.getBvn());
        return foundCustomer;
    }

    @Override
    public Customer findByCustomerId(String id) {
        for (Customer customer: customers) {
            if (customer.getBvn().equalsIgnoreCase(id)) return  customer;
        }
        return null;
    }

    @Override
    public void delete(Customer customer) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Customer> findAll() {
        return null;
    }
}
