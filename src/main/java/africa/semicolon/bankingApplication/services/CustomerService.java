package africa.semicolon.bankingApplication.services;

import africa.semicolon.bankingApplication.data.models.Customer;
import africa.semicolon.bankingApplication.data.repositories.CustomerRepository;

public interface CustomerService{
    Customer createAccount(String firstName, String lastName);

    Customer createAccount(String firstName, String lastName, String bvn);
}
