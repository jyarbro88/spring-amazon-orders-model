package com.spring.amazondatamodel.datalayer;

//import com.spring.amazondatamodel.datalayer.OrderLineItemDAO;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class OrderDAO {

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

    @OneToMany
    private List<OrderLineItemDAO> orderLineItemDAOS;



    //    private List<OrderLineItemDAO> orderLineItemDAOS;
    //    @JoinColumn(name = "id")
    //    @OneToMany

    // Todo:  Add Address Object to Order
    // Todo:  Add Account Object to Order
    // Todo:  Total up the OrderTotal based on OrderLineItemDAO total (which totals up based on qty)
    // Todo:  Add Shipping Address Object to Order

    // Todo:  Need to total up OrderLineItem qty and then multiply by price to hand back to OrderDAO


    // Todo:  Get ShipmentDAO implemented

    // Todo:  All CRUD Operations for Address
    // Todo:  All CRUD Operations for OrderLineItem
    // Todo:  All CRUD Operations for Shipment



    //    private AccountDAO account;
    //    @JoinColumn(name = "account_id", referencedColumnName = "id")
//    @ManyToOne

    //    private List<AddressDAO> addressDAOS;
    //    @JoinColumn(name = "address_id", referencedColumnName = "id")
//    @ManyToOne

    //    private List<OrderLineItemDAO> orderLineItemDAOS;
//    @OneToMany

//    @OneToOne(mappedBy = "OrderLineItemDAO")
//    private Long orderLineItemsId;


    public OrderDAO(Date orderDate, Long accountId, Long addressId, Double totalPrice, List<OrderLineItemDAO> orderLineItemDAO) {
        this.orderDate = orderDate;
        this.accountId = accountId;
        this.addressId = addressId;
        this.totalPrice = totalPrice;
        this.orderLineItemDAOS = orderLineItemDAO;
    }

    public OrderDAO() {
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
