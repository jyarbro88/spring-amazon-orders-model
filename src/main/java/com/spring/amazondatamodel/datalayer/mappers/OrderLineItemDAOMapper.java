//package com.spring.amazondatamodel.datalayer.mappers;
//
//import com.spring.amazondatamodel.datalayer.daos.OrderLineItemDAO;
//import com.spring.amazondatamodel.weblayer.beans.OrderLineItemBean;
//import org.springframework.stereotype.Component;
//
//@Component
//public class OrderLineItemDAOMapper {
//
//    public OrderLineItemDAO toDAO(OrderLineItemBean orderLineItemBean) {
//        OrderLineItemDAO orderLineItemDAO = new OrderLineItemDAO();
//
//        orderLineItemDAO.setQuantity(orderLineItemBean.getQuantity());
//        orderLineItemDAO.setShipmentId(orderLineItemBean.getShipmentId());
//        orderLineItemDAO.setTotalPrice(orderLineItemBean.getTotalPrice());
//
//        return orderLineItemDAO;
//    }
//}
