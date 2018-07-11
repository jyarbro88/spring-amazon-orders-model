package com.spring.amazondatamodel.repositories;

import com.spring.amazondatamodel.datalayer.AccountDAO;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface AccountRepository extends JpaRepository<AccountDAO, Long> {

}
