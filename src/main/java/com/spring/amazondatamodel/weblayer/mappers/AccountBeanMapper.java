//package com.spring.amazondatamodel.weblayer.mappers;
//
//import com.spring.amazondatamodel.datalayer.Account;
//import com.spring.amazondatamodel.weblayer.beans.AccountBean;
//import com.spring.amazondatamodel.weblayer.beans.AddressBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Component
//public class AccountBeanMapper {
//
//    private final AddressBeanMapper addressBeanMapper;
//
//    @Autowired
//    public AccountBeanMapper(AddressBeanMapper addressBeanMapper) {
//        this.addressBeanMapper = addressBeanMapper;
//    }
//
//    public com.spring.amazondatamodel.weblayer.beans.AccountBean toBean(Account accountDAO) {
//        AccountBean accountBean = new AccountBean();
//
//        accountBean.setFirstName(accountDAO.getFirstName());
//        accountBean.setLastName(accountDAO.getLastName());
//        accountBean.setEmail(accountDAO.getEmail());
//
//        List<AddressBean> addressBeans = accountDAO.getAddressDAOs().stream().map(addressBeanMapper::toBean).collect(Collectors.toList());
//        accountBean.setAddresses(addressBeans);
//
//        return accountBean;
//    }
//}
