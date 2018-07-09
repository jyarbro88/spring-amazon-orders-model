package com.spring.amazondatamodel.weblayer.mappers;

import com.spring.amazondatamodel.datalayer.daos.AccountDAO;
import com.spring.amazondatamodel.weblayer.beans.AccountBean;

public class AccountBeanMapper {

    public AccountBean toBean(AccountDAO accountDAO) {
        AccountBean accountBean = new AccountBean();

        accountBean.setFirstName(accountDAO.getFirstName());
        accountBean.setLastName(accountDAO.getLastName());
        accountBean.setEmail(accountDAO.getEmail());

//        accountBean.setAddresses(accountDAO.getAddressId());
//        Todo fix set addresses

        return accountBean;
    }
}
