package com.spring.amazondatamodel.services;

import com.spring.amazondatamodel.datalayer.Account;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public interface AccountService {

    public abstract void saveAccount(Account account);
    public abstract void updateAccount(Account account);
    public abstract void deleteAccount(Account account);
    public abstract List<Account> getAllAccounts();

}
