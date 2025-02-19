package datamodel.services;

import datamodel.entities.Account;
import datamodel.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service  // Marks this class as a service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    // Get all accounts
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    // Get an account by ID
    public Optional<Account> getAccountById(Long id) {
        return accountRepository.findById(id);
    }

    // Add a new account
    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    // Delete an account
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
}
