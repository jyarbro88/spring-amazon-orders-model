package com.spring.amazondatamodel.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.amazondatamodel.datalayer.AccountDAO;
import com.spring.amazondatamodel.datalayer.AddressDAO;
import com.spring.amazondatamodel.implementors.AccountServiceImpl;
import com.spring.amazondatamodel.implementors.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/accounts/addresses")
public class AddressController {

    private final AddressServiceImpl addressService;
    private final AccountServiceImpl accountService;

    @Autowired
    public AddressController(AddressServiceImpl addressService, AccountServiceImpl accountService) {
        this.addressService = addressService;
        this.accountService = accountService;
    }

    @GetMapping(
            value = {"/{accountId}"},
            produces = {"application/json"})
    @ResponseBody
    public List<AddressDAO> showAllAddressesForCustomer(
            @Valid
            @PathVariable(value = "accountId") Long accountId) {

        Optional<AccountDAO> foundAccountById = accountService.getAccountById(accountId);
        AccountDAO foundAccountDAO = foundAccountById.get();

        return foundAccountDAO.getAddressDAOS();
    }

    @PutMapping(
            value = {"/{addressId}"},
            consumes = {"application/json"}
    )
    @ResponseBody
    public ResponseEntity updateAddress(
            @Valid
            @RequestBody String addressJson,
            @PathVariable(value = "addressId") Long addressId
    ) {
        ObjectMapper mapper = new ObjectMapper();
        AddressDAO mappedAddressDAO;

        Optional<AddressDAO> foundAddressById = addressService.getAddressById(addressId);
        AddressDAO foundAddressDAO = foundAddressById.get();

        try {
            mappedAddressDAO = mapper.readValue(addressJson, AddressDAO.class);
        } catch (IOException e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        foundAddressDAO.setAddressOne(mappedAddressDAO.getAddressOne());
        foundAddressDAO.setAddressTwo(mappedAddressDAO.getAddressTwo());
        foundAddressDAO.setCity(mappedAddressDAO.getCity());
        foundAddressDAO.setState(mappedAddressDAO.getState());
        foundAddressDAO.setZipCode(mappedAddressDAO.getZipCode());
        foundAddressDAO.setCountry(mappedAddressDAO.getCountry());

        addressService.updateAddress(foundAddressDAO);

        return new ResponseEntity(HttpStatus.OK);
    }
}
