package com.spring.amazondatamodel.implementors;

import com.spring.amazondatamodel.datalayer.AccountDAO;
import com.spring.amazondatamodel.repositories.AccountRepository;
import com.spring.amazondatamodel.services.AccountService;
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
    public Optional<AccountDAO> getAccountById(Long id){
        return accountRepository.findById(id);
    }

    @Transactional
    public void saveAccount(AccountDAO accountDAO) {
        accountRepository.save(accountDAO);
    }

    @Transactional
    public void updateAccount(AccountDAO accountDAO) {
        accountRepository.save(accountDAO);
    }

    @Transactional
    public void deleteAccount(AccountDAO accountDAO) {
        accountRepository.delete(accountDAO);
    }

    @Transactional
    public List<AccountDAO> getAllAccounts() {
        return accountRepository.findAll();
    }
}
