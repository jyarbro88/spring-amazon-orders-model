//package com.spring.amazondatamodel.datalayer;
//
//import com.spring.amazondatamodel.datalayer.AddressDAO;
//
//import javax.persistence.*;
//import java.util.Date;
//import java.util.List;
//
//@Entity
//@Table(name = "shipments")
//public class Shipment {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//
//    @ManyToOne
//    private Long accountId;
//
//    @OneToOne
//    @JoinColumn(name = "address_id")
//    private Long addressId;
//
////    @OneToMany
////    @JoinColumn(name = "order_line_item_id")
////    private OrderLineItem orderLineItemDAO;
//
//
//    @OneToMany
//    private List<OrderLineItem> orderLineItems;
//
//
//    @OneToOne
////    @JoinColumn(name = "order_id")
//    private Long orderId;
//
//
//
//
//    @Column(name = "shipped_date")
//    private Date shippedDate;
//    @Column(name = "delivery_date")
//    private Date deliveryDate;
//
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getAccountId() {
//        return accountId;
//    }
//
//    public void setAccountId(Long accountId) {
//        this.accountId = accountId;
//    }
//
//    public List<OrderLineItem> getOrderLineItems() {
//        return orderLineItems;
//    }
//
//    public void setOrderLineItems(List<OrderLineItem> orderLineItems) {
//        this.orderLineItems = orderLineItems;
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
//    public Long getAddressId() {
//        return addressId;
//    }
//
//    public void setAddressId(Long addressId) {
//        this.addressId = addressId;
//    }
//
//    public Date getShippedDate() {
//        return shippedDate;
//    }
//
//    public void setShippedDate(Date shippedDate) {
//        this.shippedDate = shippedDate;
//    }
//
//    public Date getDeliveryDate() {
//        return deliveryDate;
//    }
//
//    public void setDeliveryDate(Date deliveryDate) {
//        this.deliveryDate = deliveryDate;
//    }
//}
