package com.spring.amazondatamodel.controllers;

import com.spring.amazondatamodel.datalayer.Order;
import com.spring.amazondatamodel.implementors.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Order> showAllOrders() {
        return orderService.getAllOrders();
    }


}
