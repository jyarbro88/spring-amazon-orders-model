package com.spring.amazondatamodel.repositories;

import com.spring.amazondatamodel.datalayer.OrderLineItemDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface OrderLineItemRepository extends JpaRepository<OrderLineItemDAO, Long> {

}
