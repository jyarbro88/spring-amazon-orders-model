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

@RestController
@RequestMapping("/accounts")
public class AccountController {

    // Todo:  Add Account Object to Order
    // Todo:  Handle Put operation
    // Todo:  Handle DELETE operation

    private final AccountServiceImpl accountService;


    private final AddressServiceImpl addressService;

    @Autowired
    public AccountController(AccountServiceImpl accountService, AddressServiceImpl addressService) {
        this.accountService = accountService;
        this.addressService = addressService;
    }

    @GetMapping(produces = "application/json")
    @ResponseBody
    public List<AccountDAO> showAllAccounts() {
        return accountService.getAllAccounts();
    }


    @PostMapping(consumes = "application/json")
    @ResponseBody
    public ResponseEntity addNewAccount(@Valid @RequestBody String accountJson) {

        ObjectMapper mapper = new ObjectMapper();
        AccountDAO accountDAO;

        try {
            accountDAO = mapper.readValue(accountJson, AccountDAO.class);
        } catch (IOException e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        List<AddressDAO> addressDAOS = accountDAO.getAddressDAOS();
        for (int i = 0; i < addressDAOS.size(); i++) {
            addressService.saveAddress(addressDAOS.get(i));
        }
        accountDAO.setAddressDAOS(addressDAOS);
        accountService.saveAccount(accountDAO);

        return new ResponseEntity(HttpStatus.OK);
    }
}
