package com.spring.amazondatamodel.weblayer.mappers;

import com.spring.amazondatamodel.datalayer.daos.AccountDAO;

public class AccountBeanMapper {

    public com.spring.amazondatamodel.weblayer.beans.AccountBean toBean(AccountDAO accountDAO) {
        com.spring.amazondatamodel.weblayer.beans.AccountBean accountBean = new com.spring.amazondatamodel.weblayer.beans.AccountBean();

        accountBean.setFirstName(accountDAO.getFirstName());
        accountBean.setLastName(accountDAO.getLastName());
        accountBean.setEmail(accountDAO.getEmail());

//        accountBean.setAddresses(accountDAO.getAddressId());
//        Todo fix set addresses

        return accountBean;
    }
}
