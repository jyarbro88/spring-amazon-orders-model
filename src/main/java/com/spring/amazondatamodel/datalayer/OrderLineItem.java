//package com.spring.amazondatamodel.datalayer;
//
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "order_line_items")
//public class OrderLineItem {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "id")
//    private Long orderId;
////    @ManyToOne
////    @JoinColumn(name = "order_id")
////    private Order orderDAO;
//
//    @Column(name = "quantity")
//    private Integer quantity;
//    @Column(name = "total_price")
//    private Double totalPrice;
//
//    @OneToOne
//    private Long shipmentId;
//
//    public OrderLineItem(Integer quantity, Double totalPrice, Long shipmentId) {
//        this.quantity = quantity;
//        this.totalPrice = totalPrice;
//        this.shipmentId = shipmentId;
//    }
//
//    public OrderLineItem() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//
//    public Long getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(Long orderId) {
//        this.orderId = orderId;
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
