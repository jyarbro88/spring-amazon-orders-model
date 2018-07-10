package com.spring.amazondatamodel.services;

import com.spring.amazondatamodel.datalayer.OrderLineItem;

import java.util.List;

public interface OrderLineItemService {

    public abstract void saveOrderLineItem(OrderLineItem orderLineItem);
    public abstract void updateOrderLineItem(OrderLineItem orderLineItem);
    public abstract void deleteOrderLineItem(OrderLineItem orderLineItem);
    public abstract List<OrderLineItem> getAllOrderLineItems();
}
