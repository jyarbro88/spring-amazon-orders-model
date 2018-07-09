package com.spring.amazondatamodel.datalayer.mappers;

import com.spring.amazondatamodel.datalayer.daos.AccountBean;

public class AccountDAOMapper {

    public AccountBean toDAO(com.spring.amazondatamodel.weblayer.beans.AccountBean contactBean) {
        AccountBean accountDAO = new AccountBean();

        accountDAO.setFirstName(contactBean.getFirstName());
        accountDAO.setLastName(contactBean.getLastName());
        accountDAO.setEmail(contactBean.getEmail());

        return accountDAO;
    }
}
