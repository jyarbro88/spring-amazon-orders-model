package com.spring.amazondatamodel.implementors;

import com.spring.amazondatamodel.datalayer.AddressDAO;
import com.spring.amazondatamodel.repositories.AddressRepository;
import com.spring.amazondatamodel.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Component
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;


    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Transactional
    public Optional<AddressDAO> getAddressById(Long id) {
        return addressRepository.findById(id);
    }

    @Transactional
    public void saveAddress(AddressDAO addressDAO) {
        addressRepository.save(addressDAO);
    }

    @Transactional
    public void updateAddress(AddressDAO addressDAO) {
        addressRepository.save(addressDAO);
    }

    @Transactional
    public void deleteAddress(AddressDAO addressDAO) {
        addressRepository.delete(addressDAO);
    }

    @Transactional
    public List<AddressDAO> getAllAddresses() {
        return addressRepository.findAll();
    }
}
