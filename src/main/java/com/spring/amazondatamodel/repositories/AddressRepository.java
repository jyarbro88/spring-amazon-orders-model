package com.spring.amazondatamodel.repositories;

import com.spring.amazondatamodel.datalayer.AddressDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
public interface AddressRepository extends JpaRepository<AddressDAO, Long> {

    Optional<AddressDAO> findById(Long id);


}
