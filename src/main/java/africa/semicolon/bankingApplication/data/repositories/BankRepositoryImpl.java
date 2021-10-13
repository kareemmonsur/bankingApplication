package africa.semicolon.bankingApplication.data.repositories;

import africa.semicolon.bankingApplication.data.models.Account;
import africa.semicolon.bankingApplication.data.models.Bank;

import java.util.ArrayList;
import java.util.List;

    public class BankRepositoryImpl implements BankRepository {
        private List<Account> banks = new ArrayList<>();

        @Override
        public Bank save(Bank bank) {
            banks.add(bank);
            return bank;
        }

        @Override
        public Account findAccountById(String id) {
            for (Account account : banks) {
                if (bank.getCustomerId().equalsIgnoreCase(id)) return bank;
            }
            return null;
        }

        @Override
        public void delete(Bank bank) {
            banks.remove(bank);

        }

        @Override
        public Bank save(Bank bank) {
            return null;
        }

        @Override
        public Bank findBankById(String id) {
            return null;
        }

        @Override
        public void delete(Bank bank) {

        }

        @Override
        public void delete(String id) {
            Bank bank = findBankById(id);
            delete(bank);

        }

    }
}
