package com.spring.amazondatamodel.implementors;

import com.spring.amazondatamodel.datalayer.OrderLineItem;
import com.spring.amazondatamodel.repositories.OrderLineItemRepository;
import com.spring.amazondatamodel.services.OrderLineItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class OrderLineItemServiceImpl implements OrderLineItemService {

    private final OrderLineItemRepository orderLineItemRepository;

    @Autowired
    public OrderLineItemServiceImpl(OrderLineItemRepository orderLineItemRepository) {
        this.orderLineItemRepository = orderLineItemRepository;
    }

    @Transactional
    public void saveOrderLineItem(OrderLineItem orderLineItem) {
        orderLineItemRepository.save(orderLineItem);
    }

    @Transactional
    public void updateOrderLineItem(OrderLineItem orderLineItem) {
        orderLineItemRepository.save(orderLineItem);
    }

    @Transactional
    public void deleteOrderLineItem(OrderLineItem orderLineItem) {
        orderLineItemRepository.delete(orderLineItem);
    }

    @Transactional
    public List<OrderLineItem> getAllOrderLineItems() {
        return orderLineItemRepository.findAll();
    }
}
