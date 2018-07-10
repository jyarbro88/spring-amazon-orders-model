package com.spring.amazondatamodel.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.amazondatamodel.datalayer.OrderDAO;
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

    private final OrderServiceImpl orderService;


    @Autowired
    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    @GetMapping(produces = "application/json")
    @ResponseBody
    public List<OrderDAO> showAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping(consumes = "application/json")
    @ResponseBody
    public ResponseEntity addNewOrder(@Valid @RequestBody String orderJson) {

        ObjectMapper mapper = new ObjectMapper();
        OrderDAO orderDAO;

        try {
            orderDAO = mapper.readValue(orderJson, OrderDAO.class);
        } catch (IOException e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        orderService.saveOrder(orderDAO);

        return new ResponseEntity(HttpStatus.OK);
    }
}
