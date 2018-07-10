//package com.spring.amazondatamodel.datalayer.mappers;
//
//import com.spring.amazondatamodel.datalayer.daos.AccountDAO;
//import com.spring.amazondatamodel.datalayer.daos.AddressDAO;
//import com.spring.amazondatamodel.weblayer.beans.AccountBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Component
//public class AccountDAOMapper {
//
//    private final AddressDAOMapper addressDAOMapper;
//
//    @Autowired
//    public AccountDAOMapper(AddressDAOMapper addressDAOMapper) {
//        this.addressDAOMapper = addressDAOMapper;
//    }
//
//    public AccountDAO toDAO(AccountBean accountBean) {
//        AccountDAO accountDAO = new AccountDAO();
//        updateDAO(accountBean, accountDAO);
//
//        return accountDAO;
//    }
//
//    public void updateDAO(AccountBean accountBean, AccountDAO accountDAO) {
//
//        if (accountBean.getFirstName() != null) {
//            accountDAO.setFirstName(accountBean.getFirstName());
//        }
//        if (accountBean.getLastName() != null) {
//            accountDAO.setLastName(accountBean.getLastName());
//        }
//        if (accountBean.getEmail() != null) {
//            accountDAO.setEmail(accountBean.getEmail());
//        }
//        if (accountBean.getAddresses()!= null) {
//            List<AddressDAO> addressDAOs = accountBean
//                    .getAddresses().stream()
//                    .map(addressDAOMapper::toDAO)
//                    .map(addressDAO -> {
//                                addressDAO.setAccountId(accountDAO.getId());
//                                return addressDAO;
//                            })
//                    .collect(Collectors.toList());
//            accountDAO.setAddressDAOs(addressDAOs);
//        }
//    }
//}
