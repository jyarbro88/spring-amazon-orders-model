package com.spring.amazondatamodel.datalayer.mappers;

import com.spring.amazondatamodel.datalayer.daos.AccountDAO;
import com.spring.amazondatamodel.weblayer.beans.AccountBean;

public class AccountDAOMapper {

    public AccountDAO toDAO(AccountBean contactBean) {
        AccountDAO accountDAO = new AccountDAO();

        accountDAO.setFirstName(contactBean.getFirstName());
        accountDAO.setLastName(contactBean.getLastName());
        accountDAO.setEmail(contactBean.getEmail());

        return accountDAO;
    }
}
