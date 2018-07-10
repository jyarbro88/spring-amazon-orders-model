package com.spring.amazondatamodel.repositories;

import com.spring.amazondatamodel.datalayer.AddressDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface AddressRepository extends JpaRepository<AddressDAO, Long> {


}
