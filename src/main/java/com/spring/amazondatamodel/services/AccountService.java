package com.spring.amazondatamodel.services;

import com.spring.amazondatamodel.datalayer.AccountDAO;

import java.util.List;

public interface AccountService {

    public abstract void saveAccount(AccountDAO accountDAO);
    public abstract void updateAccount(AccountDAO accountDAO);
    public abstract void deleteAccount(AccountDAO accountDAO);
    public abstract List<AccountDAO> getAllAccounts();

}
