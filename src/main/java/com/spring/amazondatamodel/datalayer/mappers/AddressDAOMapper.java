//package com.spring.amazondatamodel.datalayer.mappers;
//
//import com.spring.amazondatamodel.datalayer.daos.AddressDAO;
//import com.spring.amazondatamodel.weblayer.beans.AddressBean;
//import org.springframework.stereotype.Component;
//
//@Component
//public class AddressDAOMapper {
//
//    public AddressDAO toDAO(AddressBean addressBean) {
//        AddressDAO addressDAO = new AddressDAO();
//
//        addressDAO.setAddressOne(addressBean.getAddressOne());
//        addressDAO.setAddressTwo(addressBean.getAddressTwo());
//        addressDAO.setCity(addressBean.getCity());
//        addressDAO.setZipCode(addressBean.getZipCode());
//        addressDAO.setState(addressBean.getState());
//        addressDAO.setCountry(addressBean.getCountry());
//
//        return addressDAO;
//    }
//}