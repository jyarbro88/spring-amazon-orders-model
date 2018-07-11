package com.spring.amazondatamodel.services;

import com.spring.amazondatamodel.datalayer.OrderLineItemDAO;

import java.util.List;

public interface OrderLineItemService {

    void saveOrderLineItem(OrderLineItemDAO orderLineItemDAO);
    void updateOrderLineItem(OrderLineItemDAO orderLineItemDAO);
    void deleteOrderLineItem(OrderLineItemDAO orderLineItemDAO);
    List<OrderLineItemDAO> getAllOrderLineItems();
}
