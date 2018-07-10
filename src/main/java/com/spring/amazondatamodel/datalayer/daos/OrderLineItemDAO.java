//package com.spring.amazondatamodel.datalayer.daos;
//
//import javax.persistence.*;
//
//public class OrderLineItemDAO {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//    @Column(name = "order_id")
//    private Long orderId;
//    @ManyToOne
//    @JoinColumn(name = "order_id")
//    private OrderDAO orderDAO;
//    @Column(name = "quantity")
//    private Integer quantity;
//    @Column(name = "total_price")
//    private Double totalPrice;
//    @OneToOne
//    @JoinColumn(name = "shipment_id")
//    private Long shipmentId;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(Long orderId) {
//        this.orderId = orderId;
//    }
//
//    public OrderDAO getOrderDAO() {
//        return orderDAO;
//    }
//
//    public void setOrderDAO(OrderDAO orderDAO) {
//        this.orderDAO = orderDAO;
//    }
//
//    public Integer getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(Integer quantity) {
//        this.quantity = quantity;
//    }
//
//    public Double getTotalPrice() {
//        return totalPrice;
//    }
//
//    public void setTotalPrice(Double totalPrice) {
//        this.totalPrice = totalPrice;
//    }
//
//    public Long getShipmentId() {
//        return shipmentId;
//    }
//
//    public void setShipmentId(Long shipmentId) {
//        this.shipmentId = shipmentId;
//    }
//}
