package africa.semicolon.bankingApplication.data.repositories;

//import africa.semicolon.bankingApplication.data.models.Account;
//import africa.semicolon.bankingApplication.data.models.Bank;

import africa.semicolon.bankingApplication.data.models.Bank;

import java.util.ArrayList;
import java.util.List;

    public class BankRepositoryImpl implements BankRepository {
        private List<Bank> banks = new ArrayList<>();

        @Override
        public Bank save(Bank bank) {
            banks.add(bank);
            return bank;
        }

        @Override
        public Bank findBankById(String id) {
            for (Bank bank : banks) {
                if (bank.getBankId().equalsIgnoreCase(id)) return bank;
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
