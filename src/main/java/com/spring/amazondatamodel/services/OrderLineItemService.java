package com.spring.amazondatamodel.services;

import com.spring.amazondatamodel.datalayer.OrderLineItemDAO;

import java.util.List;

public interface OrderLineItemService {

    public abstract void saveOrderLineItem(OrderLineItemDAO orderLineItemDAO);
    public abstract void updateOrderLineItem(OrderLineItemDAO orderLineItemDAO);
    public abstract void deleteOrderLineItem(OrderLineItemDAO orderLineItemDAO);
    public abstract List<OrderLineItemDAO> getAllOrderLineItems();
}
