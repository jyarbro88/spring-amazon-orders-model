package com.spring.amazondatamodel.repositories;

import com.spring.amazondatamodel.datalayer.OrderLineItem;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface OrderLineItemRepository extends JpaRepository<OrderLineItem, Long> {

}
