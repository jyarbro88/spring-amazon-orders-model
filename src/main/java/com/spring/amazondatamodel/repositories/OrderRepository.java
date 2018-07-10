package com.spring.amazondatamodel.repositories;

import com.spring.amazondatamodel.datalayer.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface OrderRepository extends JpaRepository<Order, Long> {

}
