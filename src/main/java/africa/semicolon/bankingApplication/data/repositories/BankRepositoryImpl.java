package africa.semicolon.bankingApplication.data.repositories;

//import africa.semicolon.bankingApplication.data.models.Account;
//import africa.semicolon.bankingApplication.data.models.Bank;

import africa.semicolon.bankingApplication.data.models.Bank;

import java.util.ArrayList;
import java.util.List;

    public class BankRepositoryImpl implements BankRepository {
        private List<Bank> banks = new ArrayList<>();
        private Bank bank;

//        @Override
//        public String createAccount(String bankId, String firstName, String lastName) {
//            banks.add(bank);
//            return bank;
//        }



        @Override
        public Bank save(Bank bank) {
            return bank;
        }

    }
