package com.spring.amazondatamodel.weblayer.beans;

import java.util.Date;

public class ShipmentBean {

    private Long id;
//    private AddressBean addressBean;
//    private OrderLineItemBean orderLineItemBean;
    private Long orderId;
    private Long addressId;
    private Date shippedDate;
    private Date deliveryDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

//    public AddressBean getAddressBean() {
//        return addressBean;
//    }
//
//    public void setAddressBean(AddressBean addressBean) {
//        this.addressBean = addressBean;
//    }
//
//    public OrderLineItemBean getOrderLineItemBean() {
//        return orderLineItemBean;
//    }
//
//    public void setOrderLineItemBean(OrderLineItemBean orderLineItemBean) {
//        this.orderLineItemBean = orderLineItemBean;
//    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
