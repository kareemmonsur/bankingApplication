package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Customer;

import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{
    @Override
    public Customer save(Customer customer) {
        return customer;
    }

    @Override
    public Customer findByCustomerId(String id) {
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
