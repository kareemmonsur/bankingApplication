package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;
import africa.semicolon.bankingApplication.data.models.Bank;

public interface BankRepository {
    Bank save(Bank bank);

    bank findBankId(String id);
}


