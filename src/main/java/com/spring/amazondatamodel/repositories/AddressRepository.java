package com.spring.amazondatamodel.repositories;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.spring.amazondatamodel.datalayer.Account;
import com.spring.amazondatamodel.datalayer.daos.AddressDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface AddressRepository extends JpaRepository<AddressDAO, Long> {


}
