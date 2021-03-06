package com.spring.amazondatamodel.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.amazondatamodel.CalculateUtil;
import com.spring.amazondatamodel.datalayer.*;
import com.spring.amazondatamodel.implementors.AccountServiceImpl;
import com.spring.amazondatamodel.implementors.AddressServiceImpl;
import com.spring.amazondatamodel.implementors.OrderLineItemServiceImpl;
import com.spring.amazondatamodel.implementors.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderServiceImpl orderService;
    private final OrderLineItemServiceImpl orderLineItemService;
    private final AccountServiceImpl accountService;
    private final AddressServiceImpl addressService;

    @Autowired
    public OrderController(OrderServiceImpl orderService, OrderLineItemServiceImpl orderLineItemService, AccountServiceImpl accountService, AddressServiceImpl addressService) {
        this.orderService = orderService;
        this.orderLineItemService = orderLineItemService;
        this.accountService = accountService;
        this.addressService = addressService;
    }

    @GetMapping(produces = "application/json")
    @ResponseBody
    public List<OrderDAO> showAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping(consumes = "application/json")
    @ResponseBody
    public ResponseEntity addNewOrder(
            @Valid
            @RequestBody String orderJson) {

        CalculateUtil calculateUtil = new CalculateUtil();
        ObjectMapper mapper = new ObjectMapper();
        Date orderDate = new Date();
        OrderDAO orderDAO;

        try {
            orderDAO = mapper.readValue(orderJson, OrderDAO.class);
        } catch (IOException e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        Long accountId = orderDAO.getAccountId();
        Long billAddressId = orderDAO.getBillAddressId();
        Long shippingAddressId = orderDAO.getShippingAddressId();


        Double orderTotal = 0.00;

        Optional<AddressDAO> foundBillingAddressById = addressService.getAddressById(billAddressId);
        Optional<AddressDAO> foundShippingAddressById = addressService.getAddressById(shippingAddressId);
        Optional<AccountDAO> foundAccountById = accountService.getAccountById(accountId);

        List<OrderLineItemDAO> orderLineItemDAOS = orderDAO.getOrderLineItemDAOS();

        AddressDAO foundShippingAddressDAO = foundShippingAddressById.get();
        AddressDAO foundBillingAddressDAO = foundBillingAddressById.get();
        AccountDAO foundAccountDAO = foundAccountById.get();

        orderDAO.setShippingAddress(foundShippingAddressDAO);
        orderDAO.setAccountDAO(foundAccountDAO);
        orderDAO.setBillingAddress(foundBillingAddressDAO);

        for (int i = 0; i < orderLineItemDAOS.size(); i++) {

            OrderLineItemDAO orderLineItemDAO = orderLineItemDAOS.get(i);
            Integer quantity = orderLineItemDAO.getQuantity();
            ProductDAO productDAO = orderLineItemDAO.getProductDAO();
            Double price = productDAO.getPrice();
            Double totalPriceForLineItem = calculateUtil.calculatePriceBeforeTax(price, quantity);
            orderLineItemDAO.setLineItemTotalPrice(totalPriceForLineItem);

            orderLineItemService.saveOrderLineItem(orderLineItemDAO);
        }


        for (OrderLineItemDAO orderLineItemDAO : orderLineItemDAOS) {

            orderTotal += orderLineItemDAO.getLineItemTotalPrice();
        }

        Double orderTotalAfterTaxes = calculateUtil.calculatePriceAfterTax(orderTotal);
        orderDAO.setTotalPrice(orderTotalAfterTaxes);
        orderDAO.setOrderDate(orderDate);
        orderService.saveOrder(orderDAO);

        return new ResponseEntity(HttpStatus.OK);
    }
}
