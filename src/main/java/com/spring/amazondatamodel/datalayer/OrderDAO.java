package com.spring.amazondatamodel.datalayer;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class OrderDAO {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "order_date")
    private Date orderDate;
    @Column(name = "account_id")
    private Long accountId;
    @Column(name = "shipping_address_id", insertable = false, updatable = false)
    private Long shippingAddressId;
    @Column(name = "billing_address_id", insertable = false, updatable = false)
    private Long billAddressId;
    @Column(name = "order_total")
    private Double totalPrice;


    @OneToMany
    private List<OrderLineItemDAO> orderLineItemDAOS;
    @OneToOne
    private AccountDAO accountDAO;
    @OneToOne
    private AddressDAO billingAddress;
    @OneToOne
    private AddressDAO shippingAddress;

    public OrderDAO(Date orderDate, Long accountId, Long shippingAddressId, Long billAddressId, List<OrderLineItemDAO> orderLineItemDAOS, AccountDAO accountDAO, AddressDAO billingAddress, AddressDAO shippingAddress) {
        this.orderDate = orderDate;
        this.accountId = accountId;
        this.shippingAddressId = shippingAddressId;
        this.billAddressId = billAddressId;
        this.orderLineItemDAOS = orderLineItemDAOS;
        this.accountDAO = accountDAO;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
    }

    public OrderDAO() {
    }

    public AccountDAO getAccountDAO() {
        return accountDAO;
    }

    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public AddressDAO getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(AddressDAO billingAddress) {
        this.billingAddress = billingAddress;
    }

    public AddressDAO getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(AddressDAO shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
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

    public Long getBillAddressId() {
        return billAddressId;
    }

    public void setBillAddressId(Long billAddressId) {
        this.billAddressId = billAddressId;
    }

    public List<OrderLineItemDAO> getOrderLineItemDAOS() {
        return orderLineItemDAOS;
    }

    public void setOrderLineItemDAOS(List<OrderLineItemDAO> orderLineItemDAOS) {
        this.orderLineItemDAOS = orderLineItemDAOS;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
