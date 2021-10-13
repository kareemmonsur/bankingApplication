package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;

public class AccountRepositoryImpl implements AccountRepository{
    @Override
    public Account save(Account account) {
        return account;
    }

    @Override
    public Account findAccountById(String id) {
        return null;
    }

    @Override
    public void delete(Account account) {

    }

    @Override
    public void delete(String id) {

    }
}
