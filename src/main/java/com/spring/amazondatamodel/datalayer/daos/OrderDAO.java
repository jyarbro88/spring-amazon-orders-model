//package com.spring.amazondatamodel.datalayer.daos;
//
//import com.spring.amazondatamodel.datalayer.Account;
//
//import javax.persistence.*;
//import java.util.Date;
//import java.util.List;
//
//@Entity
//@Table(name = "orders")
//public class OrderDAO {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//    @GeneratedValue
//    @Column(name = "order_number")
//    private Long orderNumber;
//    @Column(name = "order_date")
//    private Date orderDate;
//    @ManyToOne
//    @JoinColumn(name = "account_id", referencedColumnName = "id")
//    private Account account;
//
//    @ManyToOne
//    @JoinColumn(name = "address_id", referencedColumnName = "id")
//    private List<AddressDAO> addressDAOS;
//    @OneToMany
//    @JoinColumn(name = "order_item")
//    private List<OrderLineItemDAO> orderLineItems;

//    @OneToOne(mappedBy = "OrderLineItemDAO")
//    private Long orderLineItemsId;
//    @Column(name = "order_total")
//    private Double totalPrice;
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getOrderNumber() {
//        return orderNumber;
//    }
//
//    public void setOrderNumber(Long orderNumber) {
//        this.orderNumber = orderNumber;
//    }
//
//    public Date getOrderDate() {
//        return orderDate;
//    }
//
//    public void setOrderDate(Date orderDate) {
//        this.orderDate = orderDate;
//    }
//
//    public Account getAccount() {
//        return account;
//    }
//
//    public void setAccount(Account account) {
//        this.account = account;
//    }
//
//    public List<AddressDAO> getAddressDAOS() {
//        return addressDAOS;
//    }
//
//    public void setAddressDAOS(List<AddressDAO> addressDAOS) {
//        this.addressDAOS = addressDAOS;
//    }
//
//    public Long getOrderLineItemsId() {
//        return orderLineItemsId;
//    }
//
//    public void setOrderLineItemsId(Long orderLineItemsId) {
//        this.orderLineItemsId = orderLineItemsId;
//    }
//
//    public Double getTotalPrice() {
//        return totalPrice;
//    }
//
//    public void setTotalPrice(Double totalPrice) {
//        this.totalPrice = totalPrice;
//    }
//}
