package com.spring.amazondatamodel.services;

import com.spring.amazondatamodel.datalayer.AddressDAO;

import java.util.List;

public interface AddressService {

    void saveAddress(AddressDAO addressDAO);
    void updateAddress(AddressDAO addressDAO);
    void deleteAddress(AddressDAO addressDAO);
    List<AddressDAO> getAllAddresses();
}
