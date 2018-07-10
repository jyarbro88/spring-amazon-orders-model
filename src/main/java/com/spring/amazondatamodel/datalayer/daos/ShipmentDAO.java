//package com.spring.amazondatamodel.datalayer.daos;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Entity
//@Table(name = "shipments")
//public class ShipmentDAO {

//    @Id
//    @GeneratedValue
//    private Long id;
//    @OneToOne
//    @JoinColumn(name = "address_id")
//    private AddressDAO addressDAO;

//    @OneToOne
//    @JoinColumn(name = "address_id")
//    private Long addressId;
//    @OneToMany
//    @JoinColumn(name = "order_line_item_id")
//    private OrderLineItemDAO orderLineItemDAO;
//
//    @OneToMany
//    @JoinColumn(name = "order_id")
//    private Long orderId;
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
//    public Long getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(Long orderId) {
//        this.orderId = orderId;
//    }

    //    public AddressDAO getAddressDAO() {
//        return addressDAO;
//    }
//
//    public void setAddressDAO(AddressDAO addressDAO) {
//        this.addressDAO = addressDAO;
//    }

//    public Long getAddressId() {
//        return addressId;
//    }
//
//    public void setAddressId(Long addressId) {
//        this.addressId = addressId;
//    }

//    public OrderLineItemDAO getOrderLineItemDAO() {
//        return orderLineItemDAO;
//    }
//
//    public void setOrderLineItemDAO(OrderLineItemDAO orderLineItemDAO) {
//        this.orderLineItemDAO = orderLineItemDAO;
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
