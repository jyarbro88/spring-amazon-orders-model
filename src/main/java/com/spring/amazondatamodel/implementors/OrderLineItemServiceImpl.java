package com.spring.amazondatamodel.implementors;

import com.spring.amazondatamodel.datalayer.OrderLineItemDAO;
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
    public void saveOrderLineItem(OrderLineItemDAO orderLineItemDAO) {
        orderLineItemRepository.save(orderLineItemDAO);
    }

    @Transactional
    public void updateOrderLineItem(OrderLineItemDAO orderLineItemDAO) {
        orderLineItemRepository.save(orderLineItemDAO);
    }

    @Transactional
    public void deleteOrderLineItem(OrderLineItemDAO orderLineItemDAO) {
        orderLineItemRepository.delete(orderLineItemDAO);
    }

    @Transactional
    public List<OrderLineItemDAO> getAllOrderLineItems() {
        return orderLineItemRepository.findAll();
    }
}
