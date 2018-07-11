package com.spring.amazondatamodel.datalayer;

import com.spring.amazondatamodel.datalayer.AddressDAO;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "shipments")
public class ShipmentDAO {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "order_id")
    private Long orderId;
    @Column(name = "account_id")
    private Long accountId;
    @Column(name = "shipping_address_id")
    private Long shippingAddressId;
    @Column(name = "shipped_date")
    private Date shippedDate;
    @Column(name = "delivery_date")
    private Date deliveryDate;

    @OneToMany
    private List<OrderLineItemDAO> orderLineItemDAOS;
    @OneToOne
    private AccountDAO accountDAO;
    @OneToOne
    private AddressDAO shippingAddressDAO;

    public ShipmentDAO() { }

    public ShipmentDAO(Long orderId, Long accountId, Long shippingAddressId, Date shippedDate, Date deliveryDate, List<OrderLineItemDAO> orderLineItemDAOS, AccountDAO accountDAO, AddressDAO shippingAddressDAO) {
        this.orderId = orderId;
        this.accountId = accountId;
        this.shippingAddressId = shippingAddressId;
        this.shippedDate = shippedDate;
        this.deliveryDate = deliveryDate;
        this.orderLineItemDAOS = orderLineItemDAOS;
        this.accountDAO = accountDAO;
        this.shippingAddressDAO = shippingAddressDAO;
    }

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

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getShippingAddressId() {
        return shippingAddressId;
    }

    public void setShippingAddressId(Long shippingAddressId) {
        this.shippingAddressId = shippingAddressId;
    }

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

    public List<OrderLineItemDAO> getOrderLineItemDAOS() {
        return orderLineItemDAOS;
    }

    public void setOrderLineItemDAOS(List<OrderLineItemDAO> orderLineItemDAOS) {
        this.orderLineItemDAOS = orderLineItemDAOS;
    }

    public AccountDAO getAccountDAO() {
        return accountDAO;
    }

    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public AddressDAO getShippingAddressDAO() {
        return shippingAddressDAO;
    }

    public void setShippingAddressDAO(AddressDAO shippingAddressDAO) {
        this.shippingAddressDAO = shippingAddressDAO;
    }
}
