package com.spring.amazondatamodel.weblayer.mappers;

import com.spring.amazondatamodel.datalayer.daos.OrderDAO;
import com.spring.amazondatamodel.weblayer.beans.OrderBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Collectors;

public class OrderBeanMapper {

    @Autowired
    private OrderLineItemBeanMapper orderLineItemBeanMapper;

    public OrderBean toBean(OrderDAO orderDAO) {
        OrderBean orderBean = new OrderBean();

        orderBean.setAddressId(orderDAO.getAddressId());
        orderBean.setCustomerId(orderDAO.getCustomerId());
        orderBean.setOrderDate(orderDAO.getOrderDate());
        orderBean.setOrderNumber(orderDAO.getOrderNumber());
        orderBean.setTotalPrice(orderDAO.getTotalPrice());
        orderBean.setOrderLineItemsBeans(orderDAO.getOrderLineItems()
                .stream()
                .map(orderLineItemBeanMapper::toBean)
                .collect(Collectors.toList()));

        return orderBean;
    }
}
