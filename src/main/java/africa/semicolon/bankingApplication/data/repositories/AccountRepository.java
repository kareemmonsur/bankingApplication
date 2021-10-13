package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;

public interface AccountRepository {
    Account save(Account account);
    Account findAccountById(String id);
    void delete(Account account);
    void delete(String id);

}
