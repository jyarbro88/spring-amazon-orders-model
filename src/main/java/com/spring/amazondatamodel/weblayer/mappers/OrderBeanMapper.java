package com.spring.amazondatamodel.weblayer.mappers;

import com.spring.amazondatamodel.datalayer.daos.OrderDAO;
import com.spring.amazondatamodel.weblayer.beans.OrderBean;

public class OrderBeanMapper {

    public OrderBean toBean(OrderDAO orderDAO) {
        OrderBean orderBean = new OrderBean();

        orderBean.setAddressId(orderDAO.getAddressId());
        orderBean.setCustomerId(orderDAO.getCustomerId());
        orderBean.setOrderDate(orderDAO.getOrderDate());
        orderBean.setOrderNumber(orderDAO.getOrderNumber());
        orderBean.setTotalPrice(orderDAO.getTotalPrice());
        orderBean.setOrderLineItemsList(orderDAO.getOrderLineItems());

        return orderBean;
    }
}
