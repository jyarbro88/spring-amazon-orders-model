package com.spring.amazondatamodel.weblayer.mappers;

import com.spring.amazondatamodel.datalayer.daos.AddressDAO;
import com.spring.amazondatamodel.weblayer.beans.AddressBean;

public class AddressBeanMapper {

    public AddressBean toBean(AddressDAO addressDAO) {
        AddressBean addressBean = new AddressBean();

        addressBean.setAddressOne(addressDAO.getAddressOne());
        addressBean.setAddressTwo(addressDAO.getAddressTwo());
        addressBean.setCity(addressDAO.getCity());
        addressBean.setState(addressDAO.getState());
        addressBean.setCountry(addressDAO.getCountry());
        addressBean.setZipCode(addressDAO.getZipCode());
        addressBean.setAccountDAO(addressDAO.getAccountDAO());

        return addressBean;
    }
}
