package com.spring.amazondatamodel.implementors;

import com.spring.amazondatamodel.datalayer.Account;
import com.spring.amazondatamodel.datalayer.Product;
import com.spring.amazondatamodel.repositories.AccountRepository;
import com.spring.amazondatamodel.repositories.ProductRepository;
import com.spring.amazondatamodel.services.AccountService;
import com.spring.amazondatamodel.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Component
public class AccountServiceImpl implements AccountService {


    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional
    public Optional<Account> getAccountById(Long id){
        return accountRepository.findById(id);
    }

    @Transactional
    public void saveAccount(Account account) {
        accountRepository.save(account);
    }

    @Transactional
    public void updateAccount(Account account) {
        accountRepository.save(account);
    }

    @Transactional
    public void deleteAccount(Account account) {
        accountRepository.delete(account);
    }

    @Transactional
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}
