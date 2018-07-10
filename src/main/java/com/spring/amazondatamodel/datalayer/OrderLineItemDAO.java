package com.spring.amazondatamodel.datalayer;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order_line_items")
public class OrderLineItemDAO {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private List<ProductDAO> productDAOList;

//    @ManyToOne
//    @JoinColumn(name = "order_id")
//    private OrderDAO orderDAO;

    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "total_price")
    private Double totalPrice;
//    @OneToOne
//    private Long shipmentId;


    public OrderLineItemDAO(List<ProductDAO> productDAOList, Integer quantity, Double totalPrice) {
        this.productDAOList = productDAOList;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public OrderLineItemDAO() {
    }


    public List<ProductDAO> getProductDAOList() {
        return productDAOList;
    }

    public void setProductDAOList(List<ProductDAO> productDAOList) {
        this.productDAOList = productDAOList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//
//    public Long getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(Long orderId) {
//        this.orderId = orderId;
//    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

//    public Long getShipmentId() {
//        return shipmentId;
//    }
//
//    public void setShipmentId(Long shipmentId) {
//        this.shipmentId = shipmentId;
//    }
}
