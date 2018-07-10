package com.spring.amazondatamodel.datalayer;

import com.spring.amazondatamodel.datalayer.Account;
//import com.spring.amazondatamodel.datalayer.OrderLineItem;
import com.spring.amazondatamodel.datalayer.daos.AddressDAO;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private Long id;
//    @GeneratedValue
//    @Column(name = "order_number")
//    private Long orderNumber;
    @Column(name = "order_date")
    private Date orderDate;
    @Column(name = "account_id")
    private Long accountId;
    @Column(name = "address_id")
    private Long addressId;
    @Column(name = "order_total")
    private Double totalPrice;


    //    private List<OrderLineItem> orderLineItems;
    //    @JoinColumn(name = "id")
    //    @OneToMany


    //    private Account account;
    //    @JoinColumn(name = "account_id", referencedColumnName = "id")
//    @ManyToOne

    //    private List<AddressDAO> addressDAOS;
    //    @JoinColumn(name = "address_id", referencedColumnName = "id")
//    @ManyToOne

    //    private List<OrderLineItem> orderLineItems;
//    @OneToMany

//    @OneToOne(mappedBy = "OrderLineItem")
//    private Long orderLineItemsId;


    public Order(Date orderDate, Long accountId, Long addressId, Double totalPrice) {
        this.orderDate = orderDate;
        this.accountId = accountId;
        this.addressId = addressId;
        this.totalPrice = totalPrice;
    }

    public Order() {
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

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

//    public List<OrderLineItem> getOrderLineItems() {
//        return orderLineItems;
//    }
//
//    public void setOrderLineItems(List<OrderLineItem> orderLineItems) {
//        this.orderLineItems = orderLineItems;
//    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
