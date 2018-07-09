package com.spring.amazondatamodel.datalayer.mappers;

import com.spring.amazondatamodel.datalayer.daos.AccountDAO;

public class AccountDAOMapper {

    public AccountDAO toDAO(com.spring.amazondatamodel.weblayer.beans.AccountBean contactBean) {
        AccountDAO accountDAO = new AccountDAO();

        accountDAO.setFirstName(contactBean.getFirstName());
        accountDAO.setLastName(contactBean.getLastName());
        accountDAO.setEmail(contactBean.getEmail());

        return accountDAO;
    }
}
