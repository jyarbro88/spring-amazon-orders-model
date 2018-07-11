package com.spring.amazondatamodel.repositories;

import com.spring.amazondatamodel.datalayer.OrderDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface OrderRepository extends JpaRepository<OrderDAO, Long> {

    List<OrderDAO> findAllByAccountId(Long aLong);
}
