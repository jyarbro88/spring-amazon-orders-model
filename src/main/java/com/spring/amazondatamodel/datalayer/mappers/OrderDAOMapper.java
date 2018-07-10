//package com.spring.amazondatamodel.datalayer.mappers;
//
//import com.spring.amazondatamodel.datalayer.daos.OrderDAO;
//import com.spring.amazondatamodel.weblayer.beans.OrderBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.stream.Collectors;
//
//@Component
//public class OrderDAOMapper {
//
//    private final OrderLineItemDAOMapper orderLineItemDAOMapper;
//
//    @Autowired
//    public OrderDAOMapper(OrderLineItemDAOMapper orderLineItemDAOMapper) {
//        this.orderLineItemDAOMapper = orderLineItemDAOMapper;
//    }
//
//
//    public OrderDAO toDAO(OrderBean orderBean) {
//        OrderDAO orderDAO = new OrderDAO();
//
//        orderDAO.setAddressId(orderBean.getAddressId());
//        orderDAO.setAccountId(orderBean.getAccountId());
//        orderDAO.setOrderDate(orderBean.getOrderDate());
//        orderDAO.setOrderNumber(orderBean.getOrderNumber());
//        orderDAO.setTotalPrice(orderBean.getTotalPrice());
//        orderDAO.setOrderLineItems(orderBean.getOrderLineItemsBeans().stream().map(orderLineItemDAOMapper::toDAO).collect(Collectors.toList()));
//
//        return orderDAO;
//    }
//}
