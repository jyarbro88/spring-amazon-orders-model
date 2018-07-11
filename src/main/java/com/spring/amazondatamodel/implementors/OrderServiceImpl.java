package com.spring.amazondatamodel.implementors;

import com.spring.amazondatamodel.datalayer.OrderDAO;
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
    public void saveOrder(OrderDAO orderDAO) {
        orderRepository.save(orderDAO);
    }

    @Transactional
    public void updateOrder(OrderDAO orderDAO) {
        orderRepository.save(orderDAO);
    }

    @Transactional
    public void deleteOrder(OrderDAO orderDAO) {
        orderRepository.delete(orderDAO);
    }

    @Transactional
    public List<OrderDAO> getAllOrders() {
        return orderRepository.findAll();
    }

    @Transactional
    public List<OrderDAO> getAllOrdersWithAccountId(Long accountId) {
        return orderRepository.findAllByAccountIdOrderByOrderDate(accountId);
    }
}
