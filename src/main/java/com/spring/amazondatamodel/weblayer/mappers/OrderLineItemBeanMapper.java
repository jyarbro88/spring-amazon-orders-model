package com.spring.amazondatamodel.weblayer.mappers;

import com.spring.amazondatamodel.datalayer.daos.OrderLineItemDAO;
import com.spring.amazondatamodel.weblayer.beans.OrderLineItemBean;

public class OrderLineItemBeanMapper {

    public OrderLineItemBean toBean(OrderLineItemDAO orderLineItemDAO) {
        OrderLineItemBean orderLineItemBean = new OrderLineItemBean();

        orderLineItemBean.setQuantity(orderLineItemDAO.getQuantity());
        orderLineItemBean.setShipmentId(orderLineItemDAO.getShipmentId());
        orderLineItemBean.setTotalPrice(orderLineItemDAO.getTotalPrice());

        return orderLineItemBean;
    }
}
