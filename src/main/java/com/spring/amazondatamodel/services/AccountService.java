package com.spring.amazondatamodel.services;

import com.spring.amazondatamodel.datalayer.AccountDAO;

import java.util.List;

public interface AccountService {

    void saveAccount(AccountDAO accountDAO);
    void updateAccount(AccountDAO accountDAO);
    void deleteAccount(AccountDAO accountDAO);
    List<AccountDAO> getAllAccounts();

}
