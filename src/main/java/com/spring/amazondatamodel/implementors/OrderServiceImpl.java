package com.spring.amazondatamodel.implementors;

import com.spring.amazondatamodel.datalayer.Order;
import com.spring.amazondatamodel.repositories.OrderRepository;
import com.spring.amazondatamodel.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @Transactional
    public void saveOrder(Order order) {
        orderRepository.save(order);
    }

    @Transactional
    public void updateOrder(Order order) {
        orderRepository.save(order);
    }

    @Transactional
    public void deleteOrder(Order order) {
        orderRepository.delete(order);
    }

    @Transactional
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
