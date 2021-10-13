package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;
import africa.semicolon.bankingApplication.data.models.Bank;

public interface BankRepository {
    Bank save(Bank bank);
    Bank findBankById(String id);
    void delete(Bank bank);
    void delete(String id);
}


