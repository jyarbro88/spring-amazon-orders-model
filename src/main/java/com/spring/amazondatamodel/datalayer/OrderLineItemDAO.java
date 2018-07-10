package com.spring.amazondatamodel.datalayer;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order_line_items")
public class OrderLineItemDAO {

    @Id
    @GeneratedValue
    private Long id;

//    @OneToMany
//    private List<ProductDAO> productDAOList;

    @OneToOne
    private ProductDAO productDAO;

    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "total_price")
    private Double totalPrice;
//    @OneToOne
//    private Long shipmentId;


    public OrderLineItemDAO(Integer quantity, Double totalPrice, ProductDAO productDAO) {
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.productDAO = productDAO;
    }

    public OrderLineItemDAO() {
    }

    public ProductDAO getProductDAO() {
        return productDAO;
    }

    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }


    //    public List<ProductDAO> getProductDAOList() {
//        return productDAOList;
//    }
//
//    public void setProductDAOList(List<ProductDAO> productDAOList) {
//        this.productDAOList = productDAOList;
//    }

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
