package com.spring.amazondatamodel.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.amazondatamodel.CalculateUtil;
import com.spring.amazondatamodel.datalayer.OrderDAO;
import com.spring.amazondatamodel.datalayer.OrderLineItemDAO;
import com.spring.amazondatamodel.datalayer.ProductDAO;
import com.spring.amazondatamodel.implementors.OrderLineItemServiceImpl;
import com.spring.amazondatamodel.implementors.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    // Todo:  CRUD Handle PUT operation
    // Todo:  CRUD Handle DELETE operation

    private final OrderServiceImpl orderService;

    private final OrderLineItemServiceImpl orderLineItemService;

    @Autowired
    public OrderController(OrderServiceImpl orderService, OrderLineItemServiceImpl orderLineItemService) {
        this.orderService = orderService;
        this.orderLineItemService = orderLineItemService;
    }

    @GetMapping(produces = "application/json")
    @ResponseBody
    public List<OrderDAO> showAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping(consumes = "application/json")
    @ResponseBody
    public ResponseEntity addNewOrder(@Valid @RequestBody String orderJson) {
        CalculateUtil calculateUtil = new CalculateUtil();
        ObjectMapper mapper = new ObjectMapper();
        OrderDAO orderDAO;

        try {
            orderDAO = mapper.readValue(orderJson, OrderDAO.class);
        } catch (IOException e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        List<OrderLineItemDAO> orderLineItemDAOS = orderDAO.getOrderLineItemDAOS();

        for (int i = 0; i < orderLineItemDAOS.size(); i++) {

            OrderLineItemDAO orderLineItemDAO = orderLineItemDAOS.get(i);
            Integer quantity = orderLineItemDAO.getQuantity();
            ProductDAO productDAO = orderLineItemDAO.getProductDAO();
            Double price = productDAO.getPrice();
            Double totalPriceForLineItem = calculateUtil.calculatePriceBeforeTax(price, quantity);
            orderLineItemDAO.setLineItemTotalPrice(totalPriceForLineItem);

            orderLineItemService.saveOrderLineItem(orderLineItemDAO);
        }

        Double orderTotal = 0.00;

        for (OrderLineItemDAO orderLineItemDAO: orderLineItemDAOS) {

            orderTotal += orderLineItemDAO.getLineItemTotalPrice();
        }

        Double orderTotalAfterTaxes = calculateUtil.calculatePriceAfterTax(orderTotal);

        orderDAO.setTotalPrice(orderTotalAfterTaxes);

        orderService.saveOrder(orderDAO);

        return new ResponseEntity(HttpStatus.OK);
    }
}
