package com.spring.amazondatamodel.services;

import com.spring.amazondatamodel.datalayer.daos.AddressDAO;

import java.util.List;

public interface AddressService {

    public abstract void saveAddress(AddressDAO addressDAO);
    public abstract void updateAddress(AddressDAO addressDAO);
    public abstract void deleteAddress(AddressDAO addressDAO);
    public abstract List<AddressDAO> getAllAddresses();
}
