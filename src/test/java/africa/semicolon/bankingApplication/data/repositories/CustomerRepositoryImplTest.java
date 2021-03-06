package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Bvn;
import africa.semicolon.bankingApplication.data.models.Customer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class customerRepositoryImplTest {
    private CustomerRepository customerRepository;
    @BeforeEach
    void setUp() {
       customerRepository = new CustomerRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
        Customer customer = new Customer();
        Bvn bvn = new Bvn("23355", customer);
        customer.setBvn(bvn.getId());
        customer.setFirstName("ojo");
        customer.setLastName("imma");
        Customer savedCustomer = customerRepository.save(customer);
        assertEquals(customer, savedCustomer);
    }

    @Test
    void findByCustomerId() {
        var customer = new Customer();
        var bvn = new Bvn("23355", customer);
        customer.setBvn(bvn.getId());
        customer.setFirstName("ojo");
        customer.setLastName("imma");
        Customer savedCustomer = customerRepository.save(customer);
        var foundCustomer = customerRepository.findByCustomerId("23355");
        assertEquals(savedCustomer, foundCustomer);

    }

    @Test
    void delete() {
        Customer customer = new Customer();
        Bvn bvn = new Bvn("23355", customer);
        customer.setBvn(bvn.getId());
        customer.setFirstName("ojo");
        customer.setLastName("imma");
        customerRepository.save(customer);

        assertNotNull(customerRepository.findByCustomerId("23355"));

        customerRepository.delete("23355");

        assertNull(customerRepository.findByCustomerId("23355"));
    }

    @Test
    void testDelete() {
        Customer customer = new Customer();
        Bvn bvn = new Bvn("23355", customer);
        customer.setBvn(bvn.getId());
        customer.setFirstName("ojo");
        customer.setLastName("imma");
        customerRepository.save(customer);

        assertNotNull(customerRepository.findByCustomerId("23355"));

        customerRepository.delete(customer);

        assertNull(customerRepository.findByCustomerId("23355"));
    }

    @Test
    void findAll() {
        Customer customer = new Customer();
        Bvn bvn = new Bvn("23355", customer);
        customer.setBvn(bvn.getId());
        customer.setFirstName("ojo");
        customer.setLastName("imma");
        customerRepository.save(customer);
        customerRepository.save(customer);
        customerRepository.save(customer);

        assertEquals(3, customerRepository.findAll().size());

    }
}