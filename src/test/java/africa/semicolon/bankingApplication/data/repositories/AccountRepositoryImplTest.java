package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;
import africa.semicolon.bankingApplication.data.models.Bvn;
import africa.semicolon.bankingApplication.data.models.Customer;
import africa.semicolon.bankingApplication.data.models.accountType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountRepositoryImplTest {
    AccountRepository accountRepository;
    @BeforeEach
    void setUp() {
        accountRepository = new AccountRepositoryImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void save() {
        Customer customer = new Customer();
        Account account = new Account();
        Bvn bvn = new Bvn("3444556667", customer);
        customer.setBvn(bvn.getId());
        account.setCustomerId(customer.getBvn());
        account.setNumber("333335556");
        account.setType(accountType.SAVINGS);
        Account savedAccount = accountRepository.save(account);

        assertEquals(account, savedAccount);
    }

    @Test
    void findAccountById() {
        Customer customer = new Customer();
        Account account = new Account();
        Bvn bvn = new Bvn("3444556667", customer);
        customer.setBvn(bvn.getId());
        account.setCustomerId(customer.getBvn());
        account.setNumber("333335556");
        account.setType(accountType.SAVINGS);
        Account savedAccount = accountRepository.save(account);

        Account foundAccount = accountRepository.findAccountById("3444556667");
        assertEquals(savedAccount, foundAccount);
    }

    @Test
    void delete() {
        Customer customer = new Customer();
        Account account = new Account();
        Bvn bvn = new Bvn("3444556667", customer);
        customer.setBvn(bvn.getId());
        account.setCustomerId(customer.getBvn());
        account.setNumber("333335556");
        account.setType(accountType.SAVINGS);
        Account savedAccount = accountRepository.save(account);

        assertNotNull(accountRepository.findAccountById("3444556667"));

        accountRepository.delete("3444556667");

        assertNull(accountRepository.findAccountById("3444556667"));
    }

    @Test
    void testDelete() {
        Customer customer = new Customer();
        Account account = new Account();
        Bvn bvn = new Bvn("3444556667", customer);
        account.setCustomerId(customer.getBvn());
        account.setNumber("333335556");
        account.setType(accountType.SAVINGS);
        Account savedAccount = accountRepository.save(account);

        assertNotNull(accountRepository.findAccountById("3444556667"));

        accountRepository.delete(account);

        assertNull(accountRepository.findAccountById("3444556667"));
    }

}