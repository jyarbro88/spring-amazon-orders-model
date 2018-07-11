package com.spring.amazondatamodel.repositories;

import com.spring.amazondatamodel.datalayer.OrderDAO;
import com.spring.amazondatamodel.datalayer.ShipmentDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ShipmentRepository extends JpaRepository<ShipmentDAO, Long> {

    Optional<ShipmentDAO> findById(Long id);

    List<ShipmentDAO> findAllByAccountId(Long accountId);

}
