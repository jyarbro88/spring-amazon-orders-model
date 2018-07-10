package com.spring.amazondatamodel.services;

import com.spring.amazondatamodel.datalayer.Order;

import java.util.List;

public interface OrderService {

    public abstract void saveOrder(Order order);
    public abstract void updateOrder(Order order);
    public abstract void deleteOrder(Order order);
    public abstract List<Order> getAllOrders();
}
