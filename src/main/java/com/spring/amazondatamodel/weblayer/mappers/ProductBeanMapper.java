package com.spring.amazondatamodel.weblayer.mappers;

import com.spring.amazondatamodel.datalayer.daos.ProductDAO;
import com.spring.amazondatamodel.weblayer.beans.ProductBean;

public class ProductBeanMapper {

    public ProductBean toBean(ProductDAO productDAO) {
        ProductBean productBean = new ProductBean();

        productBean.setName(productDAO.getName());
        productBean.setPrice(productDAO.getPrice());
        productBean.setDescription(productDAO.getDescription());
        productBean.setImage(productDAO.getImage());

        return productBean;
    }
}
