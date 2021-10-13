package africa.semicolon.bankingApplication.services;

import africa.semicolon.bankingApplication.data.models.Customer;
import africa.semicolon.bankingApplication.data.repositories.CustomerRepository;

public interface CustomerService{
    String createAccount(String firstName, String lastName);

    String createAccount(String firstName, String lastName, String bvn);
}
