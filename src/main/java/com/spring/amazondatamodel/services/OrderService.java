package com.spring.amazondatamodel.services;

import com.spring.amazondatamodel.datalayer.OrderDAO;

import java.util.List;

public interface OrderService {

    public abstract void saveOrder(OrderDAO orderDAO);
    public abstract void updateOrder(OrderDAO orderDAO);
    public abstract void deleteOrder(OrderDAO orderDAO);
    public abstract List<OrderDAO> getAllOrders();
}
