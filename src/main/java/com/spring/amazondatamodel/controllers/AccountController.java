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
@RequestMapping("/accounts")
public class AccountController {

    // Todo:  Handle Put operation

    private final AccountServiceImpl accountService;
    private AddressServiceImpl addressService;

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

    @PutMapping(
            value = {"/{accountId}"},
            consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity updateAccount(
            @Valid
            @RequestBody String accountJson,
            @PathVariable(value = "accountId") Long accountId
    ) {

        ObjectMapper mapper = new ObjectMapper();

        Optional<AccountDAO> foundAccountById = accountService.getAccountById(accountId);

        AccountDAO mappedAccountDAO;
        AccountDAO foundAccountDAO = foundAccountById.get();

        try {
            mappedAccountDAO = mapper.readValue(accountJson, AccountDAO.class);
        } catch (IOException e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        foundAccountDAO.setFirstName(mappedAccountDAO.getFirstName());
        foundAccountDAO.setLastName(mappedAccountDAO.getLastName());
        foundAccountDAO.setEmail(mappedAccountDAO.getEmail());

        accountService.updateAccount(foundAccountDAO);

        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping(value = {"/{accountId}"}, consumes = {"application/json"})
    @ResponseBody
    public ResponseEntity deleteAccount(
            @Valid
            @RequestBody String accountJson,
            @PathVariable(value = "accountId") Long accountId) {

        Optional<AccountDAO> foundAccount = accountService.getAccountById(accountId);

        AccountDAO foundAccountDAO = foundAccount.get();

        accountService.deleteAccount(foundAccountDAO);

        return new ResponseEntity(HttpStatus.OK);
    }
}
