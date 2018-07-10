package com.spring.amazondatamodel.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.amazondatamodel.datalayer.Account;
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

    private final AccountServiceImpl accountService;


    private final AddressServiceImpl addressService;

    @Autowired
    public AccountController(AccountServiceImpl accountService, AddressServiceImpl addressService) {
        this.accountService = accountService;
        this.addressService = addressService;
    }

    @GetMapping(produces = "application/json")
    @ResponseBody
    public List<Account> showAllAccounts() {
        return accountService.getAllAccounts();
    }


    @PostMapping(consumes = "application/json")
    @ResponseBody
    public ResponseEntity addNewAccount(@Valid @RequestBody String accountJson) {

        ObjectMapper mapper = new ObjectMapper();
//        List<AddressDAO> addressDAOS = new ArrayList<>();
        Account account;

        try {
            account = mapper.readValue(accountJson, Account.class);
        } catch (IOException e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

//        AddressDAO addressDAO = account.getAddressDAOS().get(0);
        List<AddressDAO> addressDAOS = account.getAddressDAOS();

        int counter = 0;

        for (int i = 0; i < addressDAOS.size(); i++) {
            addressService.saveAddress(addressDAOS.get(i));
        }


        account.setAddressDAOS(addressDAOS);
        accountService.saveAccount(account);


        return new ResponseEntity(HttpStatus.OK);
    }
}
