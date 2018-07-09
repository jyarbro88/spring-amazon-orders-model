package com.spring.amazondatamodel.datalayer.mappers;

import com.spring.amazondatamodel.datalayer.daos.ProductDAO;
import com.spring.amazondatamodel.weblayer.beans.ProductBean;

public class ProductDAOMapper {

    public ProductDAO toDAO(ProductBean productBean) {
        ProductDAO productDAO = new ProductDAO();

        productDAO.setName(productBean.getName());
        productDAO.setDescription(productBean.getDescription());
        productDAO.setImage(productBean.getImage());
        productDAO.setPrice(productBean.getPrice());

        return productDAO;
    }
}
