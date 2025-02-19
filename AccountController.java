package datamodel.controllers;

import datamodel.entities.Account;
import datamodel.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController  // Marks this class as a REST API Controller
@RequestMapping("/accounts")  // Base URL for all account-related APIs
public class AccountController {

    @Autowired
    private AccountService accountService;

    // ✅ Get all accounts
    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    // ✅ Get an account by ID
    @GetMapping("/{id}")
    public Optional<Account> getAccountById(@PathVariable Long id) {
        return accountService.getAccountById(id);
    }

    // ✅ Create a new account
    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.addAccount(account);
    }

    // ✅ Delete an account by ID
    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
    }
}
