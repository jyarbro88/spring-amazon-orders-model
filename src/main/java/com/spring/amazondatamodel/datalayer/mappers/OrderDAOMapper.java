package com.spring.amazondatamodel.datalayer.mappers;

import com.spring.amazondatamodel.datalayer.daos.OrderDAO;
import com.spring.amazondatamodel.weblayer.beans.OrderBean;

public class OrderDAOMapper {

    public OrderDAO toDAO(OrderBean orderBean) {
        OrderDAO orderDAO = new OrderDAO();

        orderDAO.setAddressId(orderBean.getAddressId());
        orderDAO.setCustomerId(orderBean.getCustomerId());
        orderDAO.setOrderDate(orderBean.getOrderDate());
        orderDAO.setOrderNumber(orderBean.getOrderNumber());
        orderDAO.setTotalPrice(orderBean.getTotalPrice());
        orderDAO.setOrderLineItems(orderBean.getOrderLineItemsList());

        return orderDAO;
    }
}
