package com.spring.amazondatamodel.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.amazondatamodel.datalayer.AccountDAO;
import com.spring.amazondatamodel.datalayer.AddressDAO;
import com.spring.amazondatamodel.implementors.AccountServiceImpl;
import com.spring.amazondatamodel.implementors.AddressServiceImpl;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/customers/addresses")
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
            @PathVariable(value = "accountId") Long accountId){

        Integer counter = 0;

        ObjectMapper mapper = new ObjectMapper();

        Optional<AccountDAO> foundAccountById = accountService.getAccountById(accountId);
        AccountDAO foundAccountDAO = foundAccountById.get();
        List<AddressDAO> foundListOfAddressDAOS = foundAccountDAO.getAddressDAOS();

        int sizeOfFoundAddressList = foundListOfAddressDAOS.size();

        while(counter < sizeOfFoundAddressList) {
            counter++;
            AddressDAO addressDAO = foundListOfAddressDAOS.get(counter);
//            Long addressId = addressDAO.getId();
//
//            Optional<AddressDAO> foundAddressById = addressService.getAddressById(addressId);
//            AddressDAO foundAddressDAO = foundAddressById.get();

            foundListOfAddressDAOS.add(addressDAO);
        }

        return foundListOfAddressDAOS;
    }

}
