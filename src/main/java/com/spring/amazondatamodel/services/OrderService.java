package com.spring.amazondatamodel.services;

import com.spring.amazondatamodel.datalayer.OrderDAO;

import java.util.List;

public interface OrderService {

    void saveOrder(OrderDAO orderDAO);
    void updateOrder(OrderDAO orderDAO);
    void deleteOrder(OrderDAO orderDAO);
    List<OrderDAO> getAllOrders();
}
