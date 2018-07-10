package com.spring.amazondatamodel.weblayer.beans;

import java.util.Date;
import java.util.List;

public class OrderBean {

    private Long id;
    private Long orderNumber;
    private Date orderDate;
    private Long addressId;
    private Long customerId;
    private List<OrderLineItemBean> orderLineItemsBeans;
    private Double totalPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public List<OrderLineItemBean> getOrderLineItemsBeans() {
        return orderLineItemsBeans;
    }

    public void setOrderLineItemsBeans(List<OrderLineItemBean> orderLineItemsBeans) {
        this.orderLineItemsBeans = orderLineItemsBeans;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
